async function fillPokemonData(name, order) {
  //NO TOCAR - ESTA VARIABLE CONTIENE LA INFORMACIÓN SOBRE LOS POKEMONS,
  // QUE USARÁS PARA COMPLETAR LAS ACTIVIDADES
  const pokemonData = await getPokemonData(name);

  //Actividades

  // 1) Insertar la imagen del pokemon dentro cada card. Para ello,
  // puedes explorar los elementos HTML utilizando las Dev Tools de tu
  // navegador.
  const imagen = document.querySelector(`#imagen-pokemon-${order}`);
  imagen.src = pokemonData.imagen;

  // 2) Utilizando los stats de cada pokemon, deberás rellenar cada una de las
  // barras que figuran en la card. Dependiendo de la cantidad de cada atributo
  // tendrás que decidir el color que tendrá la barra en cada caso:
  // Si la habilidad es menor a 35, la barra será de color rojo
  // Si la habilidad es mayor o igual a 35 pero menor que 70, la barra será amarilla
  // Si la habilidad es igual o mayor a 70, la barra será de color verde.
  // Deberás utilizar las clases que se encuentran en el archivo styles.css

  //ESCRIBE TU CÓDIGO A CONTINUACIÓN DENTRO DE LA FUNCIÓN:
  pokemonData.stats.forEach((stat) => {
    const barra = document.querySelector(`#barra-${stat.name}-${order}`);
    barra.style.width = `${stat.amount}%`;

if (stat.amount < 35) {
  barra.classList.add("rojo");
} else if (stat.amount >= 35 && stat.amount < 70) {
  barra.classList.add("amarillo");
} else {
  barra.classList.add("verde");
}
  });
}

//LISTADO DE POKEMONS - PUEDES CAMBIAR POR TU FAVORITO!
/*
const pokeJson= await fetch("https://xpi.co/api/v2/pokemon");
const pokeData = await pokeJson.json();

const xrray = pokeData.results;
const pokemons = xrray.map((poke) => poke.name);
*/

const pokemones=[];

fetch ("https://pokeapi.co/api/v2/pokemon?limit=1300")
.then((response) => response.json())
.then((data) => {

  pokemones.push(...data.results.map((poke) => poke.name)); //aca los tengo en un array

  // ordenar por nombre
  const pokemons = sortJSON(pokemones, "desc");
  
  //ahora los quiero ordenar por HP ataque defensa y speed
  //const pokemons = sortJSON(pokemones, "name", 'asc');
  
  pokemons.forEach((pokemon, index) => {
    const pokemonNumber = index + 1;
    createPokemonCard(pokemon, pokemonNumber);
    fillPokemonData(pokemon, pokemonNumber);
  });
});


function sortJSON(data, tipo) {

  let ordered = [];
  let dataArray = [].slice.call(data);
  
  let dataSorted =  dataArray.sort(function (a, b) {
            
    if (tipo === "desc") {
      if (a.name < b.name) return 1;
      else return -1;
    }

  });
  dataSorted.forEach(e => ordered.push(e));
  return ordered;
}

/*
const pokemons = ["mewtwo", "mew", "lucario", "charizard", "pikachu"];

//INICIALIZADOR - NO TOCAR
pokemons.forEach((pokemon, index) => {
  const pokemonNumber = index + 1;
  createPokemonCard(pokemon, pokemonNumber);
  fillPokemonData(pokemon, pokemonNumber);
});
*/