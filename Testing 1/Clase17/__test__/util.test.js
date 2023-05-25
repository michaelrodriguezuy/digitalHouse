/**
 * @jest-environment jsdom
 */

const { generateText, validateInput, createElement } = require('../util.js');

describe('Pruebas de salida de datos', () => {
   
    test('Salida con datos', () =>{
        const text = generateText('Daniel',30);
        expect(text).toBe('Daniel (30 years old)');
    });
      
    test('Salida con datos vacios', () =>{
        const text = generateText('',null);
        expect(text).toBe(' (null years old)');    
    });
    
    test('Salida sin datos', () =>{
        const text = generateText();
        expect(text).toBe('undefined (undefined years old)');    
    });

})

describe('createElement test', ()=>{

    test('crear elemento', ()=>{

        const tipo = 'li';
        const content = 'Pedro';
        const clase = 'user-item';

        const elementoPrueba = document.createElement(tipo);
        elementoPrueba.classList.add(clase);
        elementoPrueba.textContent = content;

        const resultadoObtenido = createElement(tipo, content, clase);

        expect(resultadoObtenido).toEqual(elementoPrueba);

    })


})

describe('validateInput test', () => { 

    test('validateInput valido', ()=>{

        const texto = 'testing';
        const estaVacio = false;
        const esNum = false;

        const resultadoEsperado = true;

        const resultadoObtenido = validateInput(texto, estaVacio, esNum);

        expect(resultadoObtenido).toBe(resultadoEsperado);

    })

    test('validateInput texto vacio', ()=>{

        const estaVacio = false;
        const esNum = false;

        const resultadoEsperado = false;

        const resultadoObtenido = validateInput(null, estaVacio, esNum);

        expect(resultadoObtenido).toBe(resultadoEsperado);

    })

    test('validateInput texto solo espacios', ()=>{

        const texto = '  ';
        const estaVacio = true;
        const esNum = false;

        const resultadoEsperado = false;

        const resultadoObtenido = validateInput(texto, estaVacio, esNum);

        expect(resultadoObtenido).toBe(resultadoEsperado);
    })

    test('validateInput texto numerico sin numeros', ()=>{

        const texto = NaN;
        const estaVacio = false;
        const esNum = true;

        const resultadoEsperado = false;

        const resultadoObtenido = validateInput(texto, estaVacio, esNum);

        expect(resultadoObtenido).toBe(resultadoEsperado);
    })

    test('validateInput numero+Text=NaN', ()=>{

        const texto = 'A';
        const estaVacio = true;
        const esNum = 1;

        const resultadoEsperado = false;

        const resultadoObtenido = validateInput(texto, estaVacio, esNum);

        expect(resultadoObtenido).toBe(resultadoEsperado);
    })

 })