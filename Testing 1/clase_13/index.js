//Micro desafío I
//Escribir un programa que realice una búsqueda dentro de un archivo JSON de acuerdo a los siguientes requerimientos. Este archivo JSON será utilizado como base de esta función, el mismo se obtiene como resultado de la siguiente API: https://pokeapi.co/api/v2/ability/ 
//
//Se debe cargar el archivo JSON que se obtiene como respuesta de la API mencionada anteriormente.
//Realizar una función que reciba como parámetro el “name” del pokemon a buscar.
//En el caso de encontrar el pokemon, debe mostrar un mensaje de éxito y la url correspondiente.

//En el caso de no encontrar el pokemon, se debe informar con un mensaje de advertencia.
//Desarrollar la función como una función declarada.

//Realizar una mejora en la función utilizando el método find de arreglos y una arrow function.
//Ayuda 1: Les dejamos un link donde se explica cómo implementar el método find de arreglos.
//Ayuda 2: Para importar un archivo se puede utilizar la función require() 
//Les dejamos un link donde pueden ver cómo trabajar con archivos JSON.

const prompt = require("prompt-sync")({sigint: true})
const jsonData = require('./response_ability.json')

function buscarPokemon (nombre, array){
   let mensaje= 'El pokemon no ha sido encontrado'        

    for (let index = 0; index < array.length; index++) {
        
        if (array[index].name == nombre) {
                                
            mensaje= 'El pokemon se ha encontrado con exito, su url es:' + array[index].url
        }
        
    }

    return mensaje
}

let pokemonAbuscar = prompt("A que pokemon estas buscando? ")
console.log (buscarPokemon(pokemonAbuscar, jsonData.results))


//utilizando find()
console.log(jsonData.results.find(({ name }) => name === pokemonAbuscar))


/*
Integrantes:

MAGGIARI ALBERTO
GALLARDO MANUEL
NAKLE JOAQUIN
LOPEZ YUPANQUI MÓNICA
NOVINO ORNELLA
RODRIGUEZ MICHAEL
*/