import { useState } from 'react'

import './App.css'
import Card from './Card'

function App() {

  const [data, setData] = useState('Hola, soy una tarjeta')

  return (
    <>
      <h2>primer entregable</h2>
      <h1 className='h1'>Carga de estudiantes</h1>

      <form onSubmit={''}>

      </form>
      
      <div className='contenedor-cards'>
        <Card data={data} />
      </div>
    </>
  )
}

export default App
