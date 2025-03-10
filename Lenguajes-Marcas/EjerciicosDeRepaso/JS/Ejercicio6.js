/*

Crea una función que pida un número al usuario
 y le indique si éste es par o impar

*/

function numeroPar(){
    const pedirNumero = Number(prompt("Introduce un numero para saber si es par o impar"));
    console.log(pedirNumero);

    if(pedirNumero % 2 === 0 ){
        alert("El numero introducido es : "+pedirNumero+" el cual es par.");

    } else {
        alert("El numero introducido es : "+pedirNumero+" el cual es impar.");
    }


}