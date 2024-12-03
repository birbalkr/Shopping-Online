import "./index.css";
import React from "react";
import ReactDOM from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router-dom";

import App from "./App.jsx";
import Allproducts from "./components/Products data/all_products.jsx";
import ProductsBook from "./components/Products data/products_data.jsx";
import Product_Computer from "./components/Products data/Product_Computer.jsx";
import Products_HomeKitchen from "./components/Products data/Products_HomeKitchen.jsx";
import Products_Mobile from "./components/Products data/Products_Mobile.jsx";
import ProuctsFashion from "./components/Products data/Proucts_Fashion.jsx";
import Product_sports from "./components/Products data/product_sports.jsx";
import SignIn from "./components/Sign_In/SignIn.jsx";
import SignUp from "./components/Sign_Up/SignUp.jsx";
import Onlinepay from "./components/OnlinePay/Onlinepay.jsx";
const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,

    children: [
      {
        path: "",
        element: <Allproducts />,
      },
      {
        path: "/books",
        element: <ProductsBook />,
      },
      {
        path: "/Computar",
        element: <Product_Computer />,
      },
      {
        path: "/homekitchan",
        element: <Products_HomeKitchen />,
      },
      {
        path: "/mobile",
        element: <Products_Mobile />,
      },
      {
        path: "/fashion",
        element: <ProuctsFashion />,
      },
      {
        path: "/sport",
        element: <Product_sports />,
      },
      {
        path: "/signin",
        element: <SignIn />,
      },
      {
        path: "/signup",
        element: <SignUp />,
      },
      {
        path:"/onlinepay",
        element:<Onlinepay/>
      }
    ],
  },
]);
// Render the app using ReactDOM.createRoot
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
