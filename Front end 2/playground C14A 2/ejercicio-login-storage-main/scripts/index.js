// Esta es la base de datos de nuestros usuarios
const baseDeDatos = {
  usuarios: [
    {
      id: 1,
      name: "Steve Jobs",
      email: "steve@jobs.com",
      password: "Steve123",
    },
    {
      id: 2,
      name: "Ervin Howell",
      email: "shanna@melissa.tv",
      password: "Ervin345",
    },
    {
      id: 3,
      name: "Clementine Bauch",
      email: "nathan@yesenia.net",
      password: "Floppy39876",
    },
    {
      id: 4,
      name: "Patricia Lebsack",
      email: "julianne.oconner@kory.org",
      password: "MysuperPassword345",
    },
  ],
};

// ACTIVIDAD

// Paso a paso:

const btnSession = document.querySelector(".login-btn");
const mensajeCargando = document.getElementById("loader");
const formulario = document.querySelector("form");
const error = document.getElementById("error-container");
const h1 = document.querySelector("h1");

window.addEventListener("load", () => {  

  if (localStorage.getItem("usuario")) {
    
    mensajeBienvenida();

  }
  else {  
    
    btnSession.addEventListener("click", (e) => {
      
      e.preventDefault();  
      const email = document.querySelector("#email-input").value;
      const password = document.querySelector("#password-input").value;

      consultaAsincrona(email, password);
  });
  }
});

function consultaAsincrona(email, password) {  



  return new Promise(() => {
        
    mensajeCargando.classList.remove("hidden");
    setTimeout(function(){      
      if (emailValido(email)) {
        if (passwordValido(password)) {
          if (usuarioValido(email, password)) {

             mensajeBienvenida();
          }
          else {
             mensajeError();
          }
        } else {
          mensajeError();
        }
      } else {
      mensajeError();
      }
    }, 1000)
  })
}

function emailValido(email) {
  const regex = /\S+@\S+\.\S+/;
  return regex.test(email);
}

function passwordValido(password) {
  return password.length >= 5;
}

function usuarioValido(email, password) {
  const usuario = baseDeDatos.usuarios.find((usuario) => usuario.email === email);  
  localStorage.setItem("usuario", usuario.name);
  
  return usuario && usuario.password === password;
}

function mensajeError() {
  
  mensajeCargando.classList.add("hidden");
  error.classList.remove("hidden");
  error.innerHTML = '<small>Alguno de los datos ingresados son incorrectos</small>';  
}

function mensajeBienvenida() {
  
  formulario.classList.add("hidden");

  h1.innerHTML = `Bienvenido al sitio ${localStorage.getItem("usuario")} 😀`;

  const main = document.querySelector("main");
  const btnCerrarSesion2 = document.createElement("button");

  btnCerrarSesion2.classList.add("login-btn");    
  btnCerrarSesion2.innerHTML = "Cerrar Sesión";
  main.appendChild(btnCerrarSesion2);
  
  btnCerrarSesion2.addEventListener("click", cerrarSesion);
    
}

function cerrarSesion() {
  localStorage.clear();
  location.reload();
}
// 1) Al momento de que la persona inicia sesión, si las validaciones que ya tenemos implementadas
// han sido exitosas, deberemos almacenar la información del usuario en el LocalStorage.

// 2) Al mensaje de bienvenida que ya teníamos implementado, deberemos agregarle el nombre de la
// persona y un botón de "Cerrar Sesión".

// 3) Una vez iniciada la sesión, la misma se deberá mantener en ese estado para el caso de que la persona
// recargue la página. Para ello, deberás validar si existe información del usuario al momento en
// que se produce la carga de la página, y en base a dicha condción decidir que elementos mostrar.

// 3) Para el caso de que la persona haga click en el botón "Cerrar Sesión", se deberá eliminar
// la información del usuario, mostrar un mensaje indicando que se ha cerrado la sesión, y recargar
// la página para mostrar nuevamente el formulario de login.

/* 
TIPS:
  - Para lograr los objetivos de este ejercicio, deberás valerte de algunos eventos y métodos que vimos en
    las clases anteriores. Te invitamos a que revises los recursos en caso de que tengas dudas, ya que allí
    encontrarás todas las respuestas que necesitas para completar la actividad.

  - Recuerda que puedes seleccionar y manipular los elementos del archivo index.html, usando los
    recursos que Javascript te ofrece para ello. Además, en el archivo styles.css tiene algunas clases y 
    estilos predefinidos para ayudarte a completar la actividad.

  - Al momento de guardar información del usuario en el navegador, recuerda que debemos almacenar solo la 
    información necesaria, y EN NINGUN CASO DEBEMOS GUARDAR LA CONTRASEÑA. Por ello, deberás seleccionar y
    separar la información que tienes que almacenar, a partir del objeto que contiene la información del 
    usuario.

   ¡Manos a la obra!
 */

