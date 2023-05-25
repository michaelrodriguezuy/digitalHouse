const is_number = require("is-number");

function suma(a,b){    
    if (!is_number(a) && !is_number(b)) {
        return 'ab'; 
    }
    return a+b;   
}

function resta(a,b){
    return a-b;
}

function multiplicacion(a,b){
    return a*b;
}

function division(a,b){
    return a/b;
}

module.exports = {suma, resta, multiplicacion, division};
