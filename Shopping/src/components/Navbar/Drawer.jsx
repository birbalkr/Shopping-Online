import React from "react";


export function Drawer() {


    return (
        <>
            <a className="btn mt-1" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
                <img src="/src/assets/images/menu.png" className="w-5" alt="" />
            </a>
            <div className="offcanvas offcanvas-start" tabIndex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
                <div className="offcanvas-header">
                    <button type="button" className="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>
                <div className="offcanvas-body">
                    <div>
                        <img src="/src/assets/images/logo.png" className="w-80" alt="" />
                    </div>

                    <ul>
                        <li>Books</li>
                        <li>Computer</li>
                        <li>Mobile</li>
                        <li>Home Kitchen</li>
                        <li>Sport</li>
                        <li>Fashion</li>
                        <li>Motorbike</li>
                    </ul>
                   
                </div>
            </div>
        </>
    );
}

export default Drawer;












