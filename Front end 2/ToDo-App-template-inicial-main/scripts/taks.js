// SEGURIDAD: Si no se encuentra en localStorage info del usuario
// no lo deja acceder a la página, redirigiendo al login inmediatamente.
if (!localStorage.jwt) {
    location.replace('./login.html');
}


/* ------ comienzan las funcionalidades una vez que carga el documento ------ */
window.addEventListener('load', function () {

  /* ---------------- variables globales y llamado a funciones ---------------- */

  const urlTareas = 'https://todo-api.ctd.academy/v1/tasks';
  const urlUsuarios = 'https://todo-api.ctd.academy/v1/users/getMe';
  const token = JSON.parse(localStorage.jwt);

  const formCrearTarea = document.querySelector('.nueva-tarea');
  const nuevaTarea = document.querySelector('#nuevaTarea');
  const btnCerrarSesion = document.querySelector('#closeApp');

  obtenerNombreUsuario();
  consultarTareas();

  /* -------------------------------------------------------------------------- */
  /*                          FUNCIÓN 1 - Cerrar sesión                         */
  /* -------------------------------------------------------------------------- */

  btnCerrarSesion.addEventListener('click', function () {
    Swal.fire({
      title: '¿Desea cerrar sesión?',
      icon: 'question',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Confirmar',
      cancelButtonText: 'Cancelar',
    }).then((result) => {
      if (result.isConfirmed) {
        Swal.fire('Sesión cerrada', 'Hasta pronto!', 'success');

        localStorage.clear();
        location.replace('./index.html');
      }
    });
  });

  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 2 - Obtener nombre de usuario [GET]                */
  /* -------------------------------------------------------------------------- */

  function obtenerNombreUsuario() {
   const settings = {
      method: 'GET',
      headers: {
        Authorization: token,
      },
   };
    console.log('Consultando mi usuario...')

    fetch(urlUsuarios, settings)  
      .then((response) => response.json())
      .then((data) => {
        console.log('Mi usuario es: ', data.firstName);

        const nombreUsuario = document.querySelector('.user-info p');
        nombreUsuario.innerText = data.firstName;
      })
      .catch((error) => console.log(error));
  };


  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 3 - Obtener listado de tareas [GET]                */
  /* -------------------------------------------------------------------------- */

  function consultarTareas() {
    const settings = {
      method: 'GET',
      headers: {
        Authorization: token,
      },
    };
    console.log('Consultando tareas...');
    fetch(urlTareas, settings)
      .then((response) => response.json())
      .then((tareas) => {
        console.log('Tareas del usuario');
        console.table(tareas);

        renderizarTareas(tareas);
        botonesCambioEstado();
        botonBorrarTarea();
      })
      .catch((error) => console.log(error));
  };


  /* -------------------------------------------------------------------------- */
  /*                    FUNCIÓN 4 - Crear nueva tarea [POST]                    */
  /* -------------------------------------------------------------------------- */

  formCrearTarea.addEventListener('submit', function (event) {
    event.preventDefault();
    console.log("Creando nueva tarea...")
    console.log(nuevaTarea.value);

    const payload = {
      description: nuevaTarea.value.trim(),
    };

    const settings = {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        Authorization: token,
      },
      body: JSON.stringify(payload),
    };
    console.log("Enviando la tarea al servidor...")
    fetch(urlTareas, settings)
      .then((response) => response.json())
      .then((tarea) => {
        console.log('Tarea creada!');
        console.log(tarea);

        consultarTareas();
      }
      )
      .catch((error) => console.log(error));

    formCrearTarea.reset(); //limpiamos el form

  });


  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 5 - Renderizar tareas en pantalla                 */
  /* -------------------------------------------------------------------------- */
  function renderizarTareas(listado) {

const tareasPendientes = document.querySelector('.tareas-pendientes');
const tareasCompletadas = document.querySelector('.tareas-terminadas');

//siempre pongo en limpio el html antes de renderizar
tareasPendientes.innerHTML = '';
tareasCompletadas.innerHTML = '';

const numTareasFinalizadas = document.querySelector('#cantidad.finalizadas');

let contador=0;

numTareasFinalizadas.innerText = contador;

listado.forEach((tarea) => {
  let fecha = new Date(tarea.createdAt);

  if(tarea.completed){
    contador++;
   tareasCompletadas.innerHTML += `
   <li class="tarea" data-aos="flip-up">
    <div class="hecha">
      <i class="fa-regular fa-circle-check"></i>
    </div>
    <div class="descripcion">
      <p class="nombre">${tarea.description}</p>
      <div class="cambios-estados">
        <button class="change-incompleta" id="${tarea.id}"><i class="fa-solid fa-rotate-left"></i></button>
        <button class="borrar" id="${tarea.id}"><i class="fa-regular fa-trash-can"></i></button>
      </div>
    </div>
    </li>   
    `
  }
  else{
      tareasPendientes.innerHTML += `
      <li class="tarea" data-aos="flip-up">
      <button class="change" id="${tarea.id}"><i class="fa-regular fa-circle"></i></button>
      <div class="descripcion">
        <p class="nombre">${tarea.description}</p>
        <p class="timestamp">${tarea.toLocaleDateString()}</p>
      </div>
      </li>
      `
  }

  numTareasFinalizadas.innerText = contador;
  });

};

  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 6 - Cambiar estado de tarea [PUT]                 */
  /* -------------------------------------------------------------------------- */
  function botonesCambioEstado() {
    const botonesCambioEstado = document.querySelectorAll('.change');
    



  }


  /* -------------------------------------------------------------------------- */
  /*                     FUNCIÓN 7 - Eliminar tarea [DELETE]                    */
  /* -------------------------------------------------------------------------- */
  function botonBorrarTarea() {
   
    

    

  };

});