
import Form from './Form'
import Eventos from './Event'
import './App.css'
import { useState } from 'react'

function App() {
    
  const [numero, setNumero] = useState(0)

  return (
    <>
      <Form />      
      <Eventos numero={numero} setNumero={setNumero}/>            
    </>
  )
}

export default App
