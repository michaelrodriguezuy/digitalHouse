window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
   
    const form = document.forms[0];
    const nombre = document.querySelector('#inputNombre');
    const apellido = document.querySelector('#inputApellido');
    const email = document.querySelector('#inputEmail');
    const password = document.querySelector('#inputPassword');
        
    const url = 'https://todo-api.ctd.academy/v1'; 
    

    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    form.addEventListener('submit', function (event) {

        event.preventDefault();

        const payload = {
            firstname: nombre.value,
            lastName: apellido.value,
            email: email.value,
            password: password.value,            
        };

        const settings = {
            method: 'POST',
            body: JSON.stringify(payload),
            headers: {'Content-Type': 'application/json'},                        
        };

        realizarRegister(settings);

        form.reset(); // limpiamos el formulario
    });

    /* -------------------------------------------------------------------------- */
    /*                    FUNCIÓN 2: Realizar el signup [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarRegister(settings) {
        console.log('enviando la consulta a la API');
        
        fetch(`${url}/users`, settings)
            .then(response => { //recibe la respuesta del servidor                            
                console.log(response);
                if (response.ok != true) {
                    alert('Alguno de los datos es incorrecto');
                }
                return response.json();                
            })
            .then(data => {
                console.log("promesa resuelta");                
                console.log(data);
                if (data.jwt) {
                    localStorage.setItem('jwt', JSON.stringify(data.jwt));   //guardo el JWT en el localStorage, este aun refrescando al pagina se mantiene, en cambio el sessionStorage se borra al refrescar la pagina
                    location.replace('./mis-tareas.html');
                }
            })
            .catch(error => {
                console.log('error');
                console.log(error);
            });
        





    };


});