import { useState } from 'react'

import './App.css'
import Card from './Card'

function App() {

  const [nombre, setNombre] = useState('')
  const [equipo, setEquipo] = useState('')
  const [error, setError] = useState(false)
  const [verCard, setCards] = useState(false)
  const [datosEnviados, setDatosEnviados] = useState({ nombre: '', equipo: '' });


  const limpiaForm = () => {
    setNombre('')
    setEquipo('')
  }

  const handlerSubmit = (e) => {
    e.preventDefault()
    if (nombre.trim().length >= 3 && !nombre.startsWith(' ') && equipo.trim().length >= 6) {

      setError(false)
      setCards(true)
      setDatosEnviados({ nombre, equipo })
    }
    else {
      setError('Por favor chequea que la información seas correcta')
      setCards(false)
    }

    limpiaForm()
  }

  const handleNombreChange = (e) => {
    setError(false)
    setNombre(e.target.value)
  }
  const handleEquipoChange = (e) => {
    setError(false)
    setEquipo(e.target.value)
  }

  return (
    <>
      <h2>primer entregable</h2>
      <h1 className='h1'>Carga de datos</h1>

      <form className='form' onSubmit={handlerSubmit}>

        <input type="text" placeholder='Ingrese tu nombre' value={nombre} onChange={handleNombreChange} />

        <input type="text" placeholder='Ingresa tu equipo de futbol favorito' value={equipo} onChange={handleEquipoChange} />

        <input type="submit" value="Enviar" />

      </form>

      {error && <h2>{error}</h2>}

      {verCard && !error && (
        < div className='contenedor-cards'>
          <Card nombre={datosEnviados.nombre} equipo={datosEnviados.equipo} />
        </div >
      )}

    </>
  )
}

export default App
