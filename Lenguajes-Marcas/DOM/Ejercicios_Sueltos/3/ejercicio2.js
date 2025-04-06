function  ejercicio2() {
    let valores = [];

    let pedirNumeros = Number(prompt("Introduce un numero"));

    for(let i = 0; i < pedirNumeros; i++) {

        valores.push(i);

       

    }

    console.log(valores);

    if(valores !== null) {

        let pedirX = Number(prompt("Introduzca un numero entre 0 hasta "+pedirNumeros));
        let pedirP = Number(prompt("Introduzca un numero entre 1 hasta 5"));

         let valoresBorrados = valores.splice(pedirX,pedirP);
                  

        console.log(valores+ " Despues del splice");
        console.warn(valoresBorrados+ " Valores chutados");

        alert("quedan estos elementos dentro del array" +valores,length);

       alert("Se Se han eliminado todos los números");


    } else {
        alert("Uppss algo fallo");

    }



}