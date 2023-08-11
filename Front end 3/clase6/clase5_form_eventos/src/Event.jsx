
const Event = ({numero, setNumero}) => {

    function miEvento({numero}) {
        console.log("el N° es: ", numero)
    }

    return (
        <>
            <h2>soy el Evento</h2>
            
            <button onClick={()=> setNumero(numero+1)}> Aumenta</button>

            <button onClick={()=> miEvento(numero+1)}> Aumenta?</button>

        </>
    )
}

export default Event