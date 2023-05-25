window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
    const form = document.forms[0];
    const email = document.querySelector('#inputEmail');
    const password = document.querySelector('#inputPassword');        
        
    const url = 'https://todo-api.ctd.academy/v1';

    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    form.addEventListener('submit', function (event) {
       
        event.preventDefault();

        const payload = {
            email: email.value,
            password: password.value
        };

        const settings = {
            method: 'POST',            
            body: JSON.stringify(payload),            
            headers: {'Content-Type': 'application/json'},
        };

        realizarLogin(settings);

        form.reset(); // limpiamos el formulario
    });


    /* -------------------------------------------------------------------------- */
    /*                     FUNCIÓN 2: Realizar el login [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarLogin(settings) {
       
        console.log('enviando la consulta a la API');
   
        fetch(`${url}/users/login`, settings)

            .then(response => { //recibe la respuesta del servidor                            
                console.log(response);
                if (response.ok != true) {
                    alert('Usuario o contraseña incorrectos');
                }
                return response.json();                
            })

            .then(data => {
                console.log("promesa resuelta");                                
                if (data.jwt) { //DE DONDE SALE EL TOKEN?
                    localStorage.setItem('jwt', JSON.stringify(data.jwt));   //guardo el JWT en el localStorage, este aun refrescando al pagina se mantiene, en cambio el sessionStorage se borra al refrescar la pagina
                    //window.location.href = 'index.html';
                    location.replace('./mis-tareas.html');
                } else {
                    alert('Usuario o contraseña incorrectos');
                }
            })

            .catch(error => {
                console.log(error);
            }
            );        
    };
});