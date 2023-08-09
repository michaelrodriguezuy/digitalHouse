
import './App.css'
import Hijo from './Hijo'
import { useState } from 'react'

function App() {
  
  const [contador, setContador] = useState(0)

  return (
    <>
              
      <Hijo contador={contador} setContador={setContador}/>
    </>
  )
}

export default App
