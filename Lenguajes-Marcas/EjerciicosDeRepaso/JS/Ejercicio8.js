/*

Desarrolla una función que genere un número aleatorio entre 1 y 100 (busca por internet 
como generar dicho número) y pida al usuario que lo adivine. Si el usuario indica un 
número menor, se le mostrará por pantalla el mensaje “mas alto”, y si ingresa un número 
mayor, se le mostrará el mensaje “mas bajo”. La ejecución terminará cuando le usuario 
introduzca el número correcto. Si el usuario introduce un valor no numérico, se le 
mostrará por pantalla el mensaje “eso no es un número”. 

*/

function adivinarNumero() {
    let numeroAleatorio = Math.floor(Math.random() * 100) + 1;
    console.log(numeroAleatorio); 

    let numeroUsuario;

    while (numeroUsuario !== numeroAleatorio) {
        numeroUsuario = prompt("Introduce un número entre 1 y 100:");

        
        if (isNaN(numeroUsuario)) {
            alert("Eso no es un número");
            continue;
        }

        numeroUsuario = Number(numeroUsuario);

        if (numeroUsuario < numeroAleatorio) {
            alert("Más alto");
        } else if (numeroUsuario > numeroAleatorio) {
            alert("Más bajo");
        } else {
            alert("¡Felicidades! Adivinaste el número.");
            break;
        }
    }
}


