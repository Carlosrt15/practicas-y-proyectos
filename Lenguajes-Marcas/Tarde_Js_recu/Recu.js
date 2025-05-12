function calcular() {
    let pedirNumero = Number(prompt("Introduce un numero"));
    let resultado = "";
    let impar = [];

    for (let i = 0; i <= pedirNumero; i++) {
        if (i % 2 === 0) {
            resultado += i + " ";
        } else {
            impar.push(i);

        }
    }

    console.log(resultado);



    let pedirConfirmacion = confirm(impar + "¿Son correctos?");

    if(pedirConfirmacion == true) {
        console.warn("Cálculo completado");

    } else {
        console.error("Se han calculado mal los números impares");
    }

    
}


function pedirNumeros() {

    let almacen = [];


    let pedir1 = Number(prompt("Introduce el numero 1"));
    let pedir2 = Number(prompt("Introduce el numero 2"));
    let pedir3 = Number(prompt("Introduce el numero 2"));

    almacen.push(pedir1);
    almacen.push(pedir2);
    almacen.push(pedir3);


    console.log(almacen);

    if(pedir1 === pedir3 &&  pedir3 === pedir2) {
        alert("Todos son iguales");
    } else if ( pedir1 === pedir3 || pedir2 === pedir1  || pedir2 === pedir3) {
        alert("2 de ellos son iguales");
    } else {
        alert("Ninguno es igual");
    }



}

