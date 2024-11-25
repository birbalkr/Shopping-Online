import React from 'react'
import Header from '../Header/Header'
import { Outlet } from 'react-router-dom'
import Footer from '../Footer /Footer'
import Drawer from '../Navbar/Drawer'
// import CartItem from '../CartItem/CartItem'
import Products from '../Products data/products_data'
function Layout() {
  return (
    <>
      <Header />
      <hr />
      <Drawer />
      <Products />
      <Outlet />
      <Footer />
    </>
  )
}

export default Layout
