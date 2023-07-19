window.addEventListener('load', function () {

    const formulario = document.querySelector('#update_turno_form');
    formulario.addEventListener('submit', function (event) {

        const formData = {
             id: document.querySelector('#turno_id').value,

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
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }
        fetch(url,settings)
        .then(response => response.json())

    })
})

//uso este metodo para cargar el turno y mostrarlo para una posible modificacion
 function findBy(id) {

          llenarComboPacientes();
          llenarComboOdontologos();

          const url = '/turnos'+"/"+id;
          const settings = {
              method: 'GET'
          }
          fetch(url,settings)
          .then(response => response.json())
          .then(data => {
              let turno = data;
              document.querySelector('#turno_id').value = turno.id;

              let pacientesSelect = document.querySelector('#pacientes');
              for (let i = 0; i < pacientesSelect.options.length; i++) {
                if (pacientesSelect.options[i].value === turno.paciente.id.toString()) {
                    pacientesSelect.selectedIndex = i;
                    break;
                }
              }

              let odontologosSelect = document.querySelector('#odontologos')
               for (let i = 0; i < odontologosSelect.options.length; i++) {
                   if (odontologosSelect.options[i].value === turno.odontologo.id.toString()) {
                       odontologosSelect.selectedIndex = i;
                   break;
                   }
               }

              document.querySelector('#fecha').value = turno.fecha;
              document.querySelector('#hora').value = turno.hora;

              document.querySelector('#div_turno_updating').style.display = "block";
          }).catch(error => {
              alert("Error: " + error);
          })
      }