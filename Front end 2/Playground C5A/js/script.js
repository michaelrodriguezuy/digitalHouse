const body = document.getElementById('body');

function publicarNoticia(titulo, subtitulo, cuerpo){

    const templateNoticia = `
    <header>
        Diario muy confiable
    </header>

    <h1>${titulo}</h1>
    <h2>${subtitulo}</h2>
    <p>${cuerpo}</p>

    <footer>
        Autor: Pepe Argento
    </footer>
    `;

    //body.innerHTML(templateNoticia);
    body.innerHTML = templateNoticia;
}

