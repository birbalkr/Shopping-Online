
import './App.css'
import Navbar from './components/Navbar/Navbar'
import Home from './components/Home/Home'
// import { DrawerWithNavigation } from './components/Navbar/Drawer'
import Products from './components/Products data/products_data'
import CartItem from './components/CartItem/CartItem'


function App() {
  

  return (
    <>
     <Navbar/>
     {/* <DrawerWithNavigation/> */}
     <Home/>
     <Products/>
     <CartItem/>
    </>

  )
}

export default App
