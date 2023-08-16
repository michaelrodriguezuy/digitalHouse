import { useState } from 'react'
import './App.css'
import Form from './Form'
import Turnos from './Turnos'

function App() {

  const [pacientes, setPacientes] = useState([])

  const addPaciente = (paciente) => {
    setPacientes([...pacientes, paciente])
    //el set sobreescribe el estado anterior, por eso se agrega el spread operator.. para que no le pase por arriba, sino que lo agregue
  }

  return (
    <div className='App'>
      <h1>Registro de turnos</h1>

      <Form addPaciente={addPaciente} /> {/* aca le paso la funcion addPaciente como prop al componente Form */}

      <Turnos pacientes={pacientes} /> {/* aca le paso el estado pacientes como prop al componente List */}

    </div>
  )
}

export default App
