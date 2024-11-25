import React from "react";
import { Link } from "react-router-dom";


export function Drawer() {


    return (
        < >
        <div>
        <a className="btn mt-1" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
                <img src="/src/assets/images/menu.png" className="w-5" alt="" />
            </a>
            <div className=" bg-blue-gray-700 offcanvas offcanvas-start" tabIndex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
                <div className="offcanvas-header">
                    <button type="button" className="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>
                <div className="offcanvas-body">
                    <div>
                        <img  src="/src/assets/images/logo.png" className  =" logo  w-18" alt="" />
                    </div>

                    <ul>
                        <li  className="my-2 mt-2 hover:bg-gray-500 text-xl cursor-pointer">
                            Books 
                        </li>


                        <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer ">
                        Computer
                        </li>


                        <li className="my-2 mt-2 hover:bg-gray-500 text-xl cursor-pointer">
                        Mobile 
                        </li>

                        <li className="my-2 mt-2 hover:bg-gray-500 text-xl cursor-pointerr">Home Kitchen</li>

                        <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer">Sport</li>


                        <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer">Fashion</li>



                        <li className="my-2 mt-2 hover:bg-gray-500  text-xl cursor-pointer">Motorbike</li>
                    </ul>
                   
                </div>
            </div>

        </div>

           
        </>
    );
}

export default Drawer;











