/*

Implementa una función que muestre, por consola, la tabla de multiplicar de un número
solicitado al usuario.

*/


function tablaMultiplicar(){
    let pedirNumero = Number(prompt("Introduce un numero para saber su tabla de multiplicar"));
    console.log(pedirNumero);
    
    for(let i = 1; i <= 10; i++){
        console.log(pedirNumero +" x"+i+" es igual a: "+pedirNumero*i);
    }

}