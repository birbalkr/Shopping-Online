import React from "react";


export function Drawer() {


    return (
        <>

            <hr className="border border-danger border-2 opacity-50" />

            <div className="container flex ">

                <a className="" data-bs-toggle="offcanvas" href="#offcanvasExample" aria-controls="offcanvasExample">
                    <i className="fa-solid fa-bars pt-3 px-1"></i>
                </a>
                <div className="offcanvas offcanvas-start" tabIndex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
                    <div className="offcanvas-header">
                        <h5 className="offcanvas-title" id="offcanvasExampleLabel">MENU</h5>
                        <button type="button" className="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div className="offcanvas-body">
                        <div >
                            <img className="img-fluid img" src="../src/assets/images/th-2274709550.jpeg" alt="" />
                            <ul>
                                <li className="py-2 px-5 mx-5"><a href="#">Book</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Computer</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Mobile</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Sell</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Sport</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Kitchen</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Fashion</a></li>
                                <li className="py-2 px-5 mx-5"><a href="#">Electronic</a></li>
                            </ul>
                        </div>

                    </div>

                </div>
                <nav className="nav pt-1">
                    <a className="nav-link active" aria-current="page" href="#">Active</a>
                    <a className="nav-link" href="#">Link</a>
                    <a className="nav-link" href="#">Link</a>
                    <a className="nav-link" href="#">Link</a>
                    <a className="nav-link" href="#">Link</a>
                </nav>

            </div>

        </>
    );
}

export default Drawer;












