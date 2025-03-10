/*

Cálculo de números primos 
Realiza una página para calcular los números primos entre 1 y un número menor que 100 
que introduzca el usuario. Mostrar al usuario el resultado.

*/


function calcularPrimos() {
    let numero = Number(prompt("Introduce un número menor que 100:"));

    if (numero >= 100 || numero <= 1) {
        alert("Por favor, ingresa un número entre 2 y 99.");
        return;
    }

    let primos = [];
    for (let i = 2; i <= numero; i++) {
        let esPrimo = true;
        for (let j = 2; j <= Math.sqrt(i); j++) {
            if (i % j === 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            primos.push(i);
        }
    }

    alert("Los números primos entre 1 y " + numero + " son: " + primos.join(", "));
}
