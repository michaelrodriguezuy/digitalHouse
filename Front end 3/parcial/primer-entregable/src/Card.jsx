import React from 'react'
import './Card.css'

const Card = ({nombre, equipo}) => {
  return (
    <div className='card'>
      
      {nombre
        ? <h2>Hola {nombre}</h2>
        : <h2>Nombre</h2>
      }

      {equipo
        ? <h3>Asi que sos hincha de {equipo}</h3>
        : <h3>Equipo</h3>
      }          

      <h4>vas a comer del tapper!!</h4>
    </div>
  )
}

export default Card