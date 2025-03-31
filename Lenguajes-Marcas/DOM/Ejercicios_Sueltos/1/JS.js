function arrayAleatorio() {

    let lista = [];
    
    
    while(lista.length < 10) {
        let numerosAletorios = Math.round(Math.random()*100);
        console.log(numerosAletorios);
        lista.push(numerosAletorios)
    }


    console.log(lista+" Desde fuera");
    let perdirNumero = Number(prompt("Introduce un numero (Intenta adivinar el numero)"));


    if(lista.includes(perdirNumero)) {

        alert("Bien acertaste un numero!!!!!");
    } else {
        alert(lista[2]);
    }


}


//Ejercicio 2 Udemy

function arrayIngredientes() {

    let listaIngredientes = ["Pan","Aceite","Olivas","Pimiento","Azucar"];

    alert(listaIngredientes+" La pizza Perfecta");
}