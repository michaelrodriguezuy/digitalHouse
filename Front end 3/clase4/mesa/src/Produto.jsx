import React from 'react'
import style from './Produto.module.css'

const Produto = ({ produto }) => {
    let { nome, image, preco } = produto

    return (
        
            <li className={style.li} >
                <h2>{nome}</h2>
                <img className={style.img} src={image} alt={nome} />
                <p className={style.p}>{preco}</p>
            </li>
        
    )
}

export default Produto