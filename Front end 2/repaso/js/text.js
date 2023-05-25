var varGlobal = "Soy una variable global";

function funcionGlobal() {
    console.log(varGlobal);

    if (true) {
        var varLocal = "Soy una variable local";
        console.log(varLocal);
    }

}

funcionGlobal();