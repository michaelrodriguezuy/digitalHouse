/*
console.log( alert("Esto es una alerta"))


let confirmacion= confirm("Esto es una confirmación");
console.log(confirmacion);
*/

// piedra 1
// papel 2
// tijera 3

alert("Hola!!")
let tratoEspecial= confirm("¿Quieres jugar con nosotros?");
let eleccion = 0;
let nombre;
let resultadoPartida;

if (tratoEspecial){    
    
    do {         
        nombre= prompt("¿Como te llamas?");            
    }
    while (nombre.length <3 || !isNaN(nombre));

    alert("Te damos la bienvenida a nuestro sitio web " + nombre.toUpperCase() + " gracias por la visita!!");    

    let jugador1 = iniciarJuego(); //guarda la eleccion del jugador

    console.log(jugador1);   

    let jugador2 = jugadaRandom(); //genera la eleccion de la computadora

    console.log(jugador2);

    resultadoPartida= resultadoComparacion(jugador1, jugador2);

//    console.log(resultadoPartida);
    console.log(mensajeFinal(resultadoPartida));

}else{
    alert(" Gracias por conectarse a nuestro sitio web");
}


function iniciarJuego(){
    do {         
        eleccion= parseInt(prompt("¿Que eliges? \n 1. Piedra \n 2. Papel \n 3. Tijera"));
    }
    while (eleccion > 3 || isNaN(eleccion)); // (nombre.length < 3 || !isNaN(nombre) )     
    return eleccion    ;
}

function jugadaRandom(){
    let jugada= parseInt(Math.random()*3+1);
    return jugada;
}

//devuelve el resultado de las partidas segun los numeros elejidos
function resultadoComparacion(eleccionJugador, eleccionComputadora){
    const resultadosPosibles = ["Empate", "Ganaste", "Perdiste"];
    //por defecto el jugador gana
    let resultado= resultadosPosibles[1];
    if (eleccionJugador == eleccionComputadora){
        resultado= resultadosPosibles[0];
    }
    else if ( (eleccionJugador == 1 && eleccionComputadora == 2) || (eleccionJugador == 2 && eleccionComputadora == 3) || (eleccionJugador == 3 && eleccionComputadora == 1)){

        resultado= resultadosPosibles[2];
    }
    return resultado;
}


function mensajeFinal(resultadoPartida) {    
    
    if (resultadoPartida == "Perdiste"){

        resultadoPartida = `${resultadoPartida} ... pero no aflojes, la proxima sale!!`;
    }
    return `El resultado de la partida es: ${resultadoPartida}`;    

}

//let edad = prompt("ingrese su edad");
//console.log(parseInt(edad)+2021);


//let nombre = prompt("ingrese su nombre");
//
//
//while (nombre.length<3 || !isNaN(nombre)) {
//    
//    nombre = prompt("ingrese su nombre");
//    
//}

// console.log(nombre);