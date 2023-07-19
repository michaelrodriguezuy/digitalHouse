window.addEventListener('load', function () {

    const formulario = document.querySelector('#add_new_turno');

    formulario.addEventListener('submit', function (event) {

        const formData = {
            paciente: {
                id: document.querySelector('#pacientes').value
            },
            odontologo: {
                id: document.querySelector('#odontologos').value
            },
            fecha: document.querySelector('#fecha').value,
            hora: document.querySelector('#hora').value,
        };

        const url = '/turnos';
        const settings = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then(response => response.json())
            .then(data => {

                 let successAlert = '<div  class="alert alert-success" style="display:none" role="alert">' +
                                    '<strong>Todo un exito!</strong> El turno fue ingresado. '+
                                     ' <i class="fa fa-check-circle" aria-hidden="true"></i> </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";

                 resetUploadForm();

            })
            .catch(error => {

                  let errorAlert = '<div class="alert alert-danger alert-dismissible fade show" role="alert">'+
                                                                          '<strong>Error</strong> Algo ocurrió, intenta nuevamente.'+
                                                                          '<button type="button" class="close" data-dismiss="alert" aria-label="Close">'+
                                                                            '<span aria-hidden="true">&times;</span>'+
                                                                          '</button> </div>'

                   document.querySelector('#response').innerHTML = errorAlert;
                   document.querySelector('#response').style.display = "block";

                   resetUploadForm();})
    });

    function resetUploadForm(){
        document.querySelector('#pacientes').value = 1;
        document.querySelector('#odontologos').value = 1;
        document.querySelector('#fecha').value = "";
        document.querySelector('#hora').value = "";

    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/turnosListar.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })();
});

