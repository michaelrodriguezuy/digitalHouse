
let titulo = document.querySelector('h3');
//titulo.innerHTML = "Bienvenido a Spotifront";
titulo.classList.add('titulo');

setTimeout(function() {
    
    
    respuesta = confirm("¿Desea conocer más música?")

    if (respuesta) {
        window.open("https://open.spotify.com/");
    } else {
        
        const perfil = document.querySelector(".perfil");    
                
        const parrafo = document.createElement("p");
        parrafo.style.marginTop = "40px";
        parrafo.style.color = "green";
        parrafo.textContent = "Usuario oficial de Spotifront";        
        parrafo.textContent.fontWeight = "bold";
        parrafo.style.border = "2px solid black";
        parrafo.style.padding = "10px";
        parrafo.style.borderRadius = "10px";
        parrafo.style.backgroundColor = "white";
        perfil.appendChild(parrafo);
        
        parrafo.addEventListener("click", function () {
            alert("Gracias por confiar en nosotros.");
        });
        
    }

}, 1000); //12000




/* -------------------------------------------------------------------------- */
/*                               MESA DE TRABAJO                              */
/* -------------------------------------------------------------------------- */
// Vamos a utilizar el setTimeout para preguntarle al usuario despues de unos segundos.
// 1- Una vez cargada la página y pasados 12 segundos debemos preguntarle al usuario si desea
// conocer más música (podemos usar un confirm).
// 2- Si el usuario confirma debemos abrir una nueva pestaña en -> https://open.spotify.com/
// 3- Si el usuario cancela debemos agregar un parrafo dentro del div '#perfil'(sin eliminar nada dentro)
// 4- El parrafo agregado debe ser de color verde y decir: "Usuario oficial de Spotifront"
// 5- Por ultimo, si ese parrafo es clickeado, debe mostrar una alerta al usuario que diga: "Gracias por confiar en nosotros."


