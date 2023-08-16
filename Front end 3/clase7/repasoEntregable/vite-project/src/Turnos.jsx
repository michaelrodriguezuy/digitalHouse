import React from 'react'

const Turnos = ({ pacientes }) => {
    
    return (
        <div>

            <h2> Turnos </h2>
            { pacientes.map((paciente, index) => (  
                /* el map le pongo 2 parametros, el primero es el elemento y el segundo es el index */

                <div key={index} className='card'>
                    <h3> {paciente.nombre} {paciente.apellido} </h3>
                </div>
            ))}
            
        </div>
    )
}

export default Turnos