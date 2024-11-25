import React from "react";
import { Link } from "react-router-dom";
function Footer() {
  return (
    <>
      <footer className="bg-white pt-4 sm:pt-6 lg:pt-8">
        <div className="mx-auto max-w-screen-2xl px-4 md:px-8">
          <div className="flex flex-col items-center justify-between gap-2 border-b border-t py-6 md:flex-row">
            <div className="mb-3 text-center md:mb-0 md:text-left">
              <span className="font-bold uppercase tracking-widest text-gray-800">
                Onlien-App
              </span>
              <p className="text-gray-500">Subscribe to our Online-App</p>
            </div>

            <form className="flex w-full gap-2 md:max-w-md">
              <input
                placeholder="Email"
                className="w-full flex-1 rounded border bg-gray-50 px-3 py-2 text-gray-800 placeholder-gray-500 outline-none ring-indigo-300 transition duration-100 focus:ring"
              />

              <button className="inline-block rounded bg-indigo-500 px-8 py-2 text-center text-sm font-semibold text-white outline-none ring-indigo-300 transition duration-100 hover:bg-indigo-600 focus-visible:ring active:bg-indigo-700 md:text-base">
                Send
              </button>
            </form>
          </div>
        </div>

        <div className="pt-12">
          <div className="mx-auto max-w-screen-2xl px-4 md:px-8">
            <div className="mb-16 grid grid-cols-2 gap-12 md:grid-cols-4 lg:grid-cols-6 lg:gap-8">
              <div className="col-span-full lg:col-span-2">
                <div className="mb-4 lg:-mt-2">
                  <Link
                    to="/"
                    className="inline-flex items-center gap-2 text-xl font-bold text-black md:text-2xl"
                    aria-label="logo"
                  >
                    <svg
                      width="95"
                      height="94"
                      viewBox="0 0 95 94"
                      className="h-auto w-5 text-indigo-500"
                      fill="currentColor"
                      xmlns="http://www.w3.org/2000/svg"
                    >
                      <path d="M96 0V47L48 94H0V47L48 0H96Z" />
                    </svg>
                    Online-App
                  </Link>
                </div>

                <p className="mb-6 text-gray-500 sm:pr-8">
                  Filler text is dummy text which has no meaning however looks
                  very similar to real text
                </p>

                <div className="flex gap-4">

                  <Link
                    to="#"
                    target="_blank"
                    className="text-gray-400 transition duration-100 hover:text-gray-500 active:text-gray-600"
                  >
                    <svg
                      className="h-7 w-7"
                      width="24"
                      height="24"
                      viewBox="0 0 24 24"
                      fill="currentColor"
                      xmlns="http://www.w3.org/2000/svg"
                    >
                      <path d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z" />
                    </svg>
                  </Link>

                </div>
              </div>

              <div>
                <div className="mb-4 font-bold uppercase tracking-widest text-gray-800">
                  Products
                </div>

                <nav className="flex flex-col gap-4">
                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Overview
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      API
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Customers
                    </Link>
                  </div>
                </nav>
              </div>

              <div>
                <div className="mb-4 font-bold uppercase tracking-widest text-gray-800">
                  Company
                </div>

                <nav className="flex flex-col gap-4">
                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      About
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Investor Relations
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Jobs
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Press
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Blog
                    </Link>
                  </div>
                </nav>
              </div>

              <div>
                <div className="mb-4 font-bold uppercase tracking-widest text-gray-800">
                  Support
                </div>

                <nav className="flex flex-col gap-4">
                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Contact
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Documentation
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Chat
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      FAQ
                    </Link>
                  </div>
                </nav>
              </div>

              <div>
                <div className="mb-4 font-bold uppercase tracking-widest text-gray-800">
                  Legal
                </div>

                <nav className="flex flex-col gap-4">
                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Terms of Service
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Privacy Policy
                    </Link>
                  </div>

                  <div>
                    <Link
                      to="#"
                      className="text-gray-500 transition duration-100 hover:text-indigo-500 active:text-indigo-600"
                    >
                      Cookie settings
                    </Link>
                  </div>
                </nav>
              </div>
            </div>

            <div className="border-t py-8 text-center text-sm text-gray-400">
              © 2021 - Present Flowrift. All rights reserved.
            </div>
          </div>
        </div>
      </footer>
    </>
  );
}

export default Footer;
