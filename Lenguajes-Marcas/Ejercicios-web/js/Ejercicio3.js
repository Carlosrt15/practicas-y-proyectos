/*

Crea una página que pida al usuario pares de números y muestre su suma. 
Deberá terminar cuando el usuario introduzca cero en vez del primer número.

*/

function while3() {
    let suma = 0;
    let numero1;

    while (true){
        numero1 = parseInt(prompt("Introduce el primer número(introduce 0 para terminar)"));
        
        if(numero1 === 0){
            alert("Has terminado el proceso. La suma total es: " + suma);
            break;
        }

        let numero2 = parseInt(prompt("Introduce el segundo número"));

        suma += (numero1 + numero2);

        alert("La suma actual es: " + suma);

    }


    
}