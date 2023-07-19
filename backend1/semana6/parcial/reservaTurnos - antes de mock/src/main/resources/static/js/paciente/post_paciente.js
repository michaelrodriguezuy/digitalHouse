window.addEventListener('load', function () {


    const formulario = document.querySelector('#add_new_paciente');


    formulario.addEventListener('submit', function (event) {


        const formData = {
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            dni: document.querySelector('#dni').value,
            fechaAlta: document.querySelector('#fecha').value
        };

        const url = '/pacientes';
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
                                    '<strong>Todo un exito!</strong> El paciente fue ingresado. '+
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
        document.querySelector('#nombre').value = "";
        document.querySelector('#apellido').value = "";
        document.querySelector('#dni').value = "";
        document.querySelector('#fecha').value = "";

    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/pacientesListar.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })();
});