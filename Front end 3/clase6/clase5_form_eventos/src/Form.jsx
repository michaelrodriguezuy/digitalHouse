import { useState } from 'react'


const Form = () => {

    const [nombre, setNombre] = useState("")

const handleNombre = (e) => {
    setNombre(e.target.value)
    console.log(nombre)
}

const registrar = (e) => {
    e.preventDefault()
    console.log("el nombre es: ", nombre)
}

    return (
        <>
            <h2>soy el form</h2>
            <h4>Registro</h4>

<form onSubmit={registrar}>
    <input type="text" placeholder='ingrese el nombre' onChange={handleNombre} />
    <input type="submit" value="registrar"/>
</form>

        </>
    )
}

export default Form