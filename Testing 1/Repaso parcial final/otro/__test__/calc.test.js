const { suma,  resta, multiplicacion, division } = require('../calc.js');

describe ('pruebas de suma', () => {

    test ('suma enteros', () => {
        const valor = suma(2, 2);
        expect(valor).toBe(4); //RESULTADO ESPERADO
    });

    test ('suma letras', () => {
        const valor = suma(a, b);
        expect(valor).toEqual('ab'); //RESULTADO ESPERADO
    });
    
   });

describe ('pruebas de resta', () => {

    test ('resta enteros', () => {
        const valor = resta(2, 2);
        expect(valor).toBe(0); //RESULTADO ESPERADO
    });

    test ('resta a 0', () => {
        const valor = resta(2, 0);
        expect(valor).toBe(2); //RESULTADO ESPERADO
    });

});

describe ('pruebas de multiplicacion', () => {

    test ('multiplicacion enteros', () => {
        const valor = multiplicacion(2, 2);
        expect(valor).toBe(4); //RESULTADO ESPERADO
    });
    test ('multiplicacion x 0', () => {
        const valor = multiplicacion(15, 0);
        expect(valor).toBe(0); //RESULTADO ESPERADO
    });

});

describe ('pruebas de division', () => {


    test ('division enteros', () => {
        const valor = division(2, 2);
        expect(valor).toBe(1); //RESULTADO ESPERADO
    });
    test ('division entre 0', () => {
        const valor = division(152, 0);
        expect(valor).toBe(Infinity); //RESULTADO ESPERADO
    });
    

});  
