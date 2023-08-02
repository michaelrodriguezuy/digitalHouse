
//import App from './App.css'
import Hijo from './Hijo'

function Padre() {
    return (
        <div>
            <h1>Padre</h1>
            <Hijo nombre="Juan" edad="25"/>
        </div>
    )
}

export default Padre