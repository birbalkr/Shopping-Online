
import './App.css'
import Navbar from './components/Navbar/Navbar'
import Home from './components/Home/Home'
import { DrawerWithNavigation } from './components/Navbar/Drawer'


function App() {
  

  return (
    <>
     <Navbar/>
     <DrawerWithNavigation/>
     <Home/>
    </>

  )
}

export default App
