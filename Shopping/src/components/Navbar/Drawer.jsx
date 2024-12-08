import React from "react";
import { Link } from "react-router-dom";

export function Drawer() {
  return (
    <>
      <div className="flex ml-12">
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

          <div
            className="offcanvas offcanvas-start"
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
              <div className="m-3 ">
                <i class="fa-solid fa-circle-user fa-2xl mt-3"></i>
                <Link className="font-semibold text-2xl ml-3" to="">Hello, Sign in</Link>
              </div>
              <hr />
              <h5 className="text-2xl ml-8 mt-3 font-bold">Shop by Category</h5>
              <ul className="mt-3 ml-8">
                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointer">
                  <Link to="books">Books</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer ">
                  <Link to="/computar">Computer</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointer">
                  <Link to="/mobile">Mobile</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointerr">
                  <Link to="/homekitchan">Home&Kitchen</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer">
                  <Link to="/Sport">Sport</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer">
                  <Link to="/fashion">Fashion</Link>
                </li>
              </ul>

              <hr />
              <h5 className="text-2xl ml-8 mt-3 font-bold">
                Programs & Features
              </h5>
              <ul className="mt-3 ml-8">
                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointer">
                  <Link to="/onlinepay">Online Pay</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer ">
                  <Link to="/computar">Gift Cards</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointer">
                  <Link to="/mobile">Mobile Reacharges</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointerr">
                  <Link to="/homekitchan">Online Custom</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer">
                  <Link to="/Sport">Flight Tickets</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer">
                  <Link to="/fashion">Google Play Recharge </Link>
                </li>
              </ul>

              <hr />
              <h5 className="text-2xl ml-8 mt-3 font-bold">
              Help & Settings
              </h5>
              <ul className="mt-3 ml-8">
                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointer">
                  <Link to="books">Your Account</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100  text-xl cursor-pointer ">
                  <Link to="/computar">Customer Service</Link>
                </li>

                <li className="my-2 mt-2 hover:bg-gray-100 text-xl cursor-pointer">
                  <Link to="/mobile">Sign in</Link>
                </li>
              </ul>
            </div>
          </div>
        </div>

        <div>
          <ul className="flex flex-wrap mt-2.5 menuitem">
            <li className="ml-5">
              <Link to="books">Books</Link>
            </li>

            <li className="ml-5">
              <Link to="/computar">Computer</Link>
            </li>

            <li className="ml-5">
              <Link to="/mobile">Mobile</Link>
            </li>

            <li className="ml-5 liItem ">
              <Link to="/homekitchan">Home&Kitchen</Link>
            </li>

            <li className="ml-5 liItem ">
              <Link to="/fashion">Fashion</Link>
            </li>
            <li className="ml-5 liItem ">
              <Link to="/Sport">Beauty & Personal Care</Link>
            </li>

            <li className="ml-5 liItem">
              <Link to="/fashion">Toys & Games Gift Cards</Link>
            </li>
            <li className="ml-5 liItem tabletitem laptop">
              <Link to="/Sport">Grocery & Gourmet Foods Baby</Link>
            </li>

            <li className="ml-5 liItem tabletitem laptop">
              <Link to="/fashion">Health, Household & Personal Care</Link>
            </li>
            <li className="ml-5 liItem tabletitem laptop">
              <Link to="/Sport"> Sports</Link>
            </li>

            <li className="ml-5 liItem tabletitem laptop">
              <Link to="/fashion">Fitness & Outdoors</Link>
            </li>
          </ul>
        </div>
      </div>
      {/* <marquee behavior="">
        This Is Shopping App Created by Birbal Kumar And Parbhakar Kumar
      </marquee> */}
    </>
  );
}

export default Drawer;
