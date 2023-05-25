const { generateText, validateInput, createElement } = require('../util.js');

describe('Pruebas de salida de datos', () => {
    test('Salida con datos', () =>{
        const text = generateText('Daniel',30);
        expect(text).toBe('Daniel (30 years old)');
    });
      
    <--completar-->('Salida con datos vacios', () =>{
        const text = generateText('',null);
        <--completar-->.toBe(' (null years old)');    
    });
    
    test('Salida sin datos', () =>{
        const text = generateText();
        <--completar-->('undefined (undefined years old)');    
    });
})
