import React from "react";
import { Link } from "react-router-dom";

export function Drawer() {
  return (
    <>
      <div>
        <a
          className="btn mt-1"
          data-bs-toggle="offcanvas"
          href="#offcanvasExample"
          role="button"
          aria-controls="offcanvasExample"
        >
          <img src="/src/assets/images/menu.png" className="w-5" alt="" />
        </a>
        <marquee behavior="alternate" bgcolor='red' direction="">
          This Is Shopping App Created by Birbal Kumar And Parbhakar Kumar
        </marquee>
        <div
          className=" bg-blue-gray-700 offcanvas offcanvas-start"
          tabIndex="-1"
          id="offcanvasExample"
          aria-labelledby="offcanvasExampleLabel"
        >
          <div className="offcanvas-header">
            <button
              type="button"
              className="btn-close"
              data-bs-dismiss="offcanvas"
              aria-label="Close"
            ></button>
          </div>
          <div className="offcanvas-body">
            <div>
              <img
                src="/src/assets/images/logo.png"
                className=" logo  w-18"
                alt=""
              />
            </div>

            <ul className="mt-14">
              <li className="my-2 mt-2 hover:bg-gray-500 text-2xl cursor-pointer">
                <Link className="flex flex-wrap p-6 hover:text-4xl" to="books">
                  {" "}
                  <img
                    className="w-10 mr-7"
                    src="/src/assets/images/book.png"
                    alt=""
                  />{" "}
                  Books
                </Link>
              </li>

              <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer ">
                <Link
                  className="flex flex-wrap p-6 hover:text-4xl"
                  to="/computar"
                >
                  <img
                    className="w-10 mr-7"
                    src="/src/assets/images/computer.png"
                    alt=""
                  />
                  Computer
                </Link>
              </li>

              <li className="my-2 mt-2 hover:bg-gray-500 text-xl cursor-pointer">
                <Link
                  className="flex flex-wrap p-6 hover:text-4xl"
                  to="/modile"
                >
                  <img
                    className="w-10 mr-7"
                    src="/src/assets/images/phone.png"
                    alt=""
                  />
                  Mobile
                </Link>
              </li>

              <li className="my-2 mt-2 hover:bg-gray-500 text-xl cursor-pointerr">
                <Link
                  className="flex flex-wrap p-6 hover:text-4xl"
                  to="/homekitchan"
                >
                  <img
                    className="w-10 mr-7"
                    src="/src/assets/images/kitchen.png"
                    alt=""
                  />
                  Home&Kitchen
                </Link>
              </li>

              <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer">
                <Link className="flex flex-wrap p-6 hover:text-4xl" to="/Sport">
                  <img
                    className="w-10 mr-7"
                    src="/src/assets/images/sport.png"
                    alt=""
                  />
                  Sport
                </Link>
              </li>

              <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer">
                <Link
                  className="flex flex-wrap p-6 hover:text-4xl"
                  to="/fashion"
                >
                  <img
                    className="w-10 mr-7"
                    src="/src/assets/images/fashion.png"
                    alt=""
                  />
                  Fashion
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </>
  );
}

export default Drawer;
