import React, { useEffect, useState } from "react";
import BookService from "../../service/BookService";

function ProductComputer() {
  const [loading, setLoading] = useState(true);
  const [books, setBooks] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      setLoading(true);
      try {
        const response = await BookService.getcomputer();
        setBooks(response.data);
      } catch (error) {
        console.log(error);
        setBooks([]);
      }
      setLoading(false);
    };
    fetchData();
  }, []);

  return (
    <div className="bg-white py-6 sm:py-8 lg:py-12">
      <div className="mx-auto max-w-screen-2xl px-4 md:px-8">
        {loading ? (
          <div className="text-center text-lg text-gray-500">Loading...</div>
        ) : books && books.length > 0 ? (
          <div className="grid gap-4 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4">
            {books.map((book) => (
              <div key={book.id} className="group relative block h-96 overflow-hidden rounded-t-lg bg-gray-100">
                <a href="/" className="group relative block h-full overflow-hidden rounded-t-lg bg-gray-100">
                  <img
                    src={book.image1}
                    loading="lazy"
                    alt={book.title}
                    className="h-full w-full object-cover object-center transition duration-200 group-hover:scale-110"
                  />
                  <span className="absolute left-0 top-3 rounded-r-lg bg-red-500 px-3 py-1.5 text-sm font-semibold uppercase tracking-wider text-white">
                    -50%
                  </span>
                </a>

                <div className="flex items-start justify-between gap-2 rounded-b-lg bg-gray-100 p-4">
                  <div className="flex flex-col">
                    <a
                      href="#"
                      className="font-bold text-gray-800 transition duration-100 hover:text-gray-500 lg:text-lg"
                    >
                      {book.title}
                    </a>
                    <span className="text-sm text-gray-500 lg:text-base">{book.author}</span>
                  </div>

                  <div className="flex flex-col items-end">
                    <span className="font-bold text-gray-600 lg:text-lg">{book.price}</span>
                    <span className="text-sm text-red-500 line-through">$39.99</span>
                  </div>
                </div>
              </div>
            ))}
          </div>
        ) : (
          <div className="text-center text-lg text-gray-500">No books available.</div>
        )}
      </div>
    </div>
  );
}

export default ProductComputer;
