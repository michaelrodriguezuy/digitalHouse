

  const jsonData = `
{
  "squadName": "Super hero squad",
  "homeTown": "Metro City",
  "formed": 2016,
  "secretBase": "Super tower",
  "active": true,
  "members": [
    {
      "name": "Molecule Man",
      "age": 29,
      "secretIdentity": "Dan Jukes",
      "powers": ["Radiation resistance", "Turning tiny", "Radiation blast"]
    },
    {
      "name": "Madame Uppercut",
      "age": 39,
      "secretIdentity": "Jane Wilson",
      "powers": [
        "Million tonne punch",
        "Damage resistance",
        "Superhuman reflexes"
      ]
    },
    {
      "name": "Eternal Flame",
      "age": 1000000,
      "secretIdentity": "Unknown",
      "powers": [
        "Immortality",
        "Heat Immunity",
        "Inferno",
        "Teleportation",
        "Interdimensional travel"
      ]
    }
  ]
}
`;
window.onload = function () {

const miembros = document.getElementById("miembros");

if (localStorage.getItem("nombreUsuario") == null) {
  let usuario= prompt("Ingrese su nombre de usuario: ");

  console.log(`Su nombre de usuario es: ${usuario}`); //pido el nombre de usuario con el fin de poder guardarlo en el Storage

  localStorage.setItem("nombreUsuario", usuario); //guardo el nombre de usuario en el Storage

}
else {
  let usuario= localStorage.getItem("nombreUsuario");
  console.log(`Su nombre de usuario es: ${localStorage.getItem("nombreUsuario")}`); //si el usuario ya ingreso su nombre de usuario, lo muestro en la consola
}

console.log(localStorage)

recorrerMiembros();

};


//Recorrer el JSON e insertar en el listado del html los nombres de los miembros
function recorrerMiembros() {
    //escribe la lógica
  let jsonData2 = JSON.parse(jsonData);

  for (let i = 0; i < jsonData2.members.length; i++) {
    miembros.innerHTML += `<li>${jsonData2.members[i].name}</li>`;
  }
    
};

