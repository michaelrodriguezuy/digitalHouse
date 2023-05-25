/**
 * @jest-environment jsdom
 */

 const { init, limpiar, resetear, resolver } = require('../funcionalidad');

 const fs = require("fs");
 document.body.innerHTML = fs.readFileSync("./calculadora.html");


describe("pruebas init()", () => {
    
    test ('init', () => {
        init()        
    });

    test ('evento uno', () => {
        limpiar(),
        init(),
        uno.click();        
        expect(resultado.textContent).toBe('1');    
    });
    test ('evento dos', () => {
        limpiar(),
        init(),
        dos.click();        
        expect(resultado.textContent).toBe('2');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        tres.click();        
        expect(resultado.textContent).toBe('3');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        cuatro.click();        
        expect(resultado.textContent).toBe('4');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        cinco.click();        
        expect(resultado.textContent).toBe('5');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        seis.click();        
        expect(resultado.textContent).toBe('6');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        siete.click();        
        expect(resultado.textContent).toBe('7');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        ocho.click();        
        expect(resultado.textContent).toBe('8');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        nueve.click();        
        expect(resultado.textContent).toBe('9');    
    });
    test ('evento uno', () => {
        limpiar(),
        init(),
        cero.click();        
        expect(resultado.textContent).toBe('0');    
    });

});

describe("pruebas limpiar()", () => {
    test ('Resultado vacio', () => {
        limpiar();
        expect(resultado.textContent).toBe("");
    });    
});

describe("pruebas resetear()", () => {
    test ('Resultado vacio', () => {
        resetear();
        expect(resultado.textContent).toBe("");
    });
});

describe("pruebas resolver()", () => {
    test('Resolver suma', () => { 
        init();
        limpiar();
        var resultado = document.getElementById('resultado');

        var igual = document.getElementById('igual');
        var suma = document.getElementById('suma');
        var uno = document.getElementById('uno');
        var dos = document.getElementById('dos');

        uno.click();
        uno.click();

        suma.click();
        
        dos.click();
        dos.click();

        igual.click();

        expect(resultado.textContent).toBe('33');

     })

     test('Resolver resta', () => { 
        init();
        limpiar();
        var resultado = document.getElementById('resultado');

        var igual = document.getElementById('igual');
        var resta = document.getElementById('resta');
        var uno = document.getElementById('uno');
        var dos = document.getElementById('dos');

        dos.click();
        dos.click();
        resta.click();
        
        uno.click();
        uno.click();

        igual.click();

        expect(resultado.textContent).toBe('11');

     })

     test('Resolver multiplicacion', () => { 
        init();
        limpiar();
        var resultado = document.getElementById('resultado');

        var igual = document.getElementById('igual');
        var multiplicacion = document.getElementById('multiplicacion');
        var uno = document.getElementById('uno');
        var dos = document.getElementById('dos');

        dos.click();
        dos.click();
        multiplicacion.click();
        
        uno.click();
        uno.click();

        igual.click();

        expect(resultado.textContent).toBe('242');

     })

     test('Resolver division', () => { 
        init();
        limpiar();
        var resultado = document.getElementById('resultado');

        var igual = document.getElementById('igual');
        var division = document.getElementById('division');
        var uno = document.getElementById('uno');
        var dos = document.getElementById('dos');

        dos.click();
        dos.click();
        division.click();
        
        uno.click();
        uno.click();

        igual.click();

        expect(resultado.textContent).toBe('2');

     })
});
describe('Botones', () => { 
    test('Probando botones', ()=>{
        init();
        limpiar();
      
        uno.click();
        dos.click();
        tres.click();
        cuatro.click();
        cinco.click();
        seis.click();
        siete.click();
        ocho.click();
        nueve.click();
        cero.click();

        //var resultado = document.getElementById('resultado');

        expect(resultado.textContent).toBe('1234567890');

    })
   })