import { useState } from 'react'

const Form = ({ addPaciente }) => {

    const [nombre, setNombre] = useState('')
    const [apellido, setApellido] = useState('')

    const handleSubmit = (e) => {
        e.preventDefault()
        if (nombre && apellido) {
            addPaciente({nombre, apellido}) //enviamos el objeto con los datos del paciente para agregarlo al array
            setNombre('')
            setApellido('')
        }
    }

    return (
        <form onSubmit={handleSubmit}>

            <label htmlFor="nombre">Nombre</label>

            <input type="text" placeholder='Ingrese su nombre' value={nombre} onChange={(e) => setNombre(e.target.value)} />
            {/* el value es lo que el usuario escribe */}

            <label htmlFor="apellido">Apellido</label>

            <input type="text" placeholder='Ingrese su apellido' value={apellido} onChange={(e) => setApellido(e.target.value)} />

            <input type="submit" value="Agregar paciente" />

        </form>
    )
}

export default Form