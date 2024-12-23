
import './App.css'


import Header from './components/Header/Header'
import Footer from './components/Footer /Footer'
import Drawer from './components/Navbar/Drawer'
import ProductsBook from './components/Products data/products_data'
import { Outlet } from 'react-router-dom'


function App() {


  return (
    <>
      <Header />
      <hr />
      <Drawer />
      <Outlet />
      <Footer />

    </>

  )
}

export default App
