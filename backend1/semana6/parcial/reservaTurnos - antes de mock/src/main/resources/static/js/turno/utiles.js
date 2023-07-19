function llenarComboPacientes(){

            let comboBoxPacientes = document.getElementById("pacientes");

            const url='/pacientes';
            const settings= {
                method: 'GET'
            }
            fetch(url, settings)
            .then(response => response.json())
            .then(data => {
                for(paciente of data){
                    let option = document.createElement("option");
    		        option.value = paciente.id;
    		        option.text = paciente.nombre.toUpperCase() +" " +
    		        paciente.apellido.toUpperCase();
    		        comboBoxPacientes.appendChild(option);
    		    }
    	    })
    }

function llenarComboOdontologos(){


    let comboBoxOdontologos = document.getElementById("odontologos");


              const url='/odontologos';
              const settings= {
                  method: 'GET'
              }
              fetch(url, settings)
              .then(response => response.json())
              .then(data => {
                  for(odontologo of data){
                      let option = document.createElement("option");
      		        option.value = odontologo.id;
      		        option.text = odontologo.nombre.toUpperCase() +" " +
      		                    odontologo.apellido.toUpperCase();
      		        comboBoxOdontologos.appendChild(option);
      		    }
      	    })
  }

    $(document).ready(function() {
      llenarComboPacientes();
      llenarComboOdontologos();
    });