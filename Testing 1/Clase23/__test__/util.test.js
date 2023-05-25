const { generateText, validateInput } = require('../util.js');


describe ('hechas por mi', () => {
    test ('prueba del validate input 1', () => {
        const valor = validateInput(".", "   ",1006);
        expect(valor).toBe(true); //RESULTADO ESPERADO
    });
    test ('prueba del validate input 2', () => {
        const valor = validateInput("peroche", "   ",1006);
        expect(valor).toBe(true); //RESULTADO ESPERADO
    });
    test('Salida de Nombre y Edad', () =>{
        const text = generateText('Daniel', 30);
        expect(text).toBe('Daniel (30 years old)'); //RESULTADO ESPERADO
    });
   });
   
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