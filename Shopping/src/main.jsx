import './index.css';
import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import Layout from '../src/components/layout/Layout'; 
import Home from './components/Home/Home.jsx';
import Navbar from './components/Navbar/Navbar.jsx';

const router = createBrowserRouter([
  {
    path:"/",
    element:<Layout/>,

    children:[
      {
        path:"",
        element:<Home/>
      },
      {
        path:"/",
        element:<Navbar/>
      }
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
