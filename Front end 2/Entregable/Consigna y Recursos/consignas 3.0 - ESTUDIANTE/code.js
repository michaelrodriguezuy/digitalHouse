/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
const nombre = prompt("Ingresa tu nombre");
const anioNacimiento =  parseInt(prompt("Ingresa el año en que naciste"));               
const ciudad = prompt("Ingresa la ciudad donde vives");

const respuesta = confirm("Te interesa Javascript?");
if (respuesta) {
  interesPorJs = 'Si';  
} else {
  interesPorJs = 'No';
}

hoy = new Date();
anioActual = hoy.getFullYear()

datosPersona.nombre = nombre;
datosPersona.edad = anioActual - anioNacimiento;
datosPersona.ciudad = ciudad;
datosPersona.interesPorJs = interesPorJs;
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */

  document.querySelector("#nombre").innerHTML = datosPersona.nombre;
  document.querySelector("#edad").innerHTML = datosPersona.edad;
  document.querySelector("#ciudad").innerHTML = datosPersona.ciudad;
  document.querySelector("#javascript").innerHTML = datosPersona.interesPorJs;

}

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  for (let i = 0; i < listado.length; i++) {
    const elemento = listado[i];
    const fila = document.querySelector("#fila")
    const tarjeta = document.createElement("tarjeta");

    tarjeta.classList.add("caja");    
        
    tarjeta.innerHTML = `    
    <img src="${elemento.imgUrl}" alt="${elemento.lenguajes}">
    <br>
    <p>Lenguajes: ${elemento.lenguajes} </p>
    <br>
    <p>Bimestre: ${elemento.bimestre} </p>
    <br>
    `;

    fila.appendChild(tarjeta);
  }
  
  materiasBtn.removeEventListener("click", recorrerListadoYRenderizarTarjetas);
}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */ 
  const sitio = document.querySelector("#sitio");  
  sitio.classList.toggle("dark");  

}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */

window.addEventListener("keydown", mostrarSobreMi); 

function mostrarSobreMi(e) {  
  if (e.key == "F") {
    const sobreMi = document.querySelector("#sobre-mi");
    sobreMi.removeAttribute("class");
  }
}