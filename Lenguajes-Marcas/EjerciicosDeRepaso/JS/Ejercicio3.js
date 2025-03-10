/*
Implementa una función que pida al usuario dos números cualesquiera y, a continuación, 
muestre la suma de ambos utilizando console.log. 

Deberá funcionar también en los casos 
en que el usuario introduzca valores con decimales. 


*/

function mostrarSuma(){
    let numero1 = parseFloat(prompt("Introduce el primer numero"));
    let numero2 = parseFloat(prompt("Introduce el segundo numero"));
    const suma = numero1 + numero2;
    console.info(suma);
}