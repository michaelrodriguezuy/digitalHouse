import React from 'react'
import './Card.css'

const Card = ({data}) => {
  return (
    <div className='card'>
        {data}
    </div>
  )
}

export default Card