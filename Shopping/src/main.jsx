import './index.css';
import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';

import App from './App.jsx';
import Books from './components/productPage/Books.jsx';
import Products from './components/productPage/Products.jsx';

const router = createBrowserRouter([
  {
    path:"/",
    element:<App/>,

    children:[
      {
        path:"",
        element:<Products/>
      },
     
    ]
  }
])
// Render the app using ReactDOM.createRoot
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} /> 
  </React.StrictMode>
);
