import { useState } from "react";

const Form = () => {

    const [name, setName] = useState("");
    const [age, setAge] = useState("");
    const [pokemon, setPokemon] = useState("");

    function clear(){
        setName("");
        setAge("");
        setPokemon("");
    }

    function saveUserName(e){
        setName(e.target.value);
    }
    function saveUserAge(e){
        setAge(e.target.value);
    }
    function saveUserPok(e){
        setPokemon(e.target.value);
    }
    
    const register = (e) => {
        e.preventDefault();
        console.log("Se guardaron los datos correctamente");
        console.log(name);
        console.log(age);
        console.log(pokemon);

        alert(`Se guardaron los datos correctamente: ${name}, ${age}, ${pokemon}`);

        clear();
    }


    return (
        <div className="contenedor">
            <h2>formulario de registro</h2>

            <form onSubmit={register}>

                <label>Nombre completo </label>
                <input type='text' placeholder='Ingrese el nombre' onChange={saveUserName} value={name}/>

                <label>Edad </label>
                <input type='number' placeholder='Ingrese el edad' onChange={saveUserAge} value={age}/>

                <label>Pokemon favorito </label>
                <input type='text' placeholder='Ingrese su pokemon favorito' onChange={saveUserPok} value={pokemon}/>

                <input type="submit" value="registrar" />
            </form>
        </div>
    )
}

export default Form