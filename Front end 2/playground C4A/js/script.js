
/* let elH1 = document.querySelector('h1');
let elUl = document.querySelector('.nav-bar');
let allLi = document.querySelectorAll('li');
let elLi = document.querySelector('li');

console.log(elH1);
console.log(elUl);
console.log(allLi);
console.log(elLi);

console.log('hola nene2')
console.log('hola 11424245')
console.log('hola 1141245455')
console.log('hola 455das5dsadsadsadsadsadsadsadsadsa')

 */

const sitio = document.querySelector('body');
const btnTema = document.querySelector('.tema button')
const menuItems =  document.querySelectorAll('nav li');
const contenedorNoticias = document.querySelector('main');
const articulos = document.querySelectorAll('article');
const titulos = document.querySelectorAll('article h2');

let cambiarTema = confirm("Desea cambiar el tema de la página a modo oscuro?")

if(cambiarTema) {
    elegirTema()
}


function elegirTema() {
    sitio.classList.toggle("dark")
}