
import './App.css'
import Navbar from './components/Navbar/Navbar'
import Home from './components/Home/Home'
import { DrawerWithNavigation } from './components/Navbar/Drawer'
import Products from './components/Products data/products_data'


function App() {
  

  return (
    <>
     <Navbar/>
     <DrawerWithNavigation/>
     <Home/>
     <Products/>
    </>

  )
}

export default App
