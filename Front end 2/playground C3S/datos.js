
//const premioTotal = 2500;
//const casilla = 10;
//
//function calcular(aciertos) {    
//    
//    if (aciertos>0 && aciertos<=10){
//        
//        aciertos = `El usuario recibira como premio: ${aciertos*premioTotal}`;    
//    }
//    else {
//        aciertos = `El usuario no recibira premio`; 
//    }
//    return aciertos;    
//
//}
//
//console.log(calcular(11));

const finalRuleta = 25;

function tirarRuleta() {
    let numGanador= Math.floor(Math.random() * finalRuleta) + 1;
    
    console.log(`El numero sorteado es: ${numGanador}`);

    for (let i=1; i<=finalRuleta; i++){
        console.log(i);

        if (i==numGanador){
            return (`Y el numero ganador es...: ${numGanador}`);
        }
    }

    
}

console.log(tirarRuleta());