import React from 'react'

const Hijo = ({contador, setContador}) => {
    return (
        <>
                
            <h1>soy el Hijo</h1>
            <h4>{contador}</h4>
            <button onClick={()=> setContador(contador+1)}> Aumenta</button>
            <button onClick={()=> setContador(contador-1)}> Disminuye</button>
            
        </>
    )
}

export default Hijo