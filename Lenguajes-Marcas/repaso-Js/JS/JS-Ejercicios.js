/*

Implementa una función que solicite al usuario su nombre y, después, le muestre un 
mensaje de bienvenida. 
*/

function helloUser(){
   const userName = prompt("Introduzca su nombre ");
   alert("Bienvenido "+userName);
}



/*
Desarrolla una función que solicite al usuario su edad y luego decida si es mayor de edad o 
no, mostrándoselo al usuario mediante un mensaje de confirmación. 

*/

function edadSelect(){
    let pedirEdad = prompt("Introduce tu edad");
    let pedirConfirmacion = confirm("¿Realmente tienes esta edad?: "+pedirEdad);
    console.log(pedirConfirmacion);

    if(pedirConfirmacion == true) {
        alert("Si has elejido la opcion de +18")
    } else {
        alert("Oooh no eres -18");
    }
}

/*

Implementa una función que pida al usuario dos números cualesquiera y, a continuación, 
muestre la suma de ambos utilizando console.log. Deberá funcionar también en los casos 
en que el usuario introduzca valores con decimales.

*/

function sumaNumeros(){
    let primerNumero = prompt("Introduce el primer numero");
    let segundoNumero = prompt("Introduce el Segundo numero");

    const sumaNumeros = primerNumero + segundoNumero;
    console.log("La suma de ambos numeros:"+primerNumero+" + "+segundoNumero+ " da un total de : "+sumaNumeros);

}


/*
Escribe una función que declare un array de nombres y agregue, al final del mismo, un 
nuevo nombre que pida al usuario por pantalla. Sacará por consola, a modo de error, el 
array completo. 
*/

function nombresArray(){
    let nombresArray = ["Carlos", "Laura", "Raul"];

    let añadeNombre = prompt("Escribe el nombre que quieres añadir");
    nombresArray.push(añadeNombre);
    console.warn(nombresArray);

}

/*

Crea una función que cree un array y lo complete con números que vaya pidiendo al 
usuario. Cuando el usuario introduzca una letra cualquiera, el programa recorrerá el array 
creado y mostrará uno a uno, por consola a modo de warning, aquellos números que sean 
pares.
*/
function arrayPar(){
    let arrayNumeros = [];
    let pedirNumero;

    while(true){
        pedirNumero = prompt("Introduce un numero (mete una letra para terminar)");

        if (isNaN(pedirNumero)) {
            break;
        }

        arrayNumeros.push(pedirNumero);
        for(let i = 0; i< arrayNumeros.length; i++) {
            if (arrayNumeros[i] % 2 == 0) {
                console.warn(arrayNumeros[i]);
            }
        }

    }
       
}


/*
Crea una función que pida un número al usuario y le indique si éste es par o impar. 
*/

function parNoPar(){
    let perdirNumero = prompt("Introduce un numero para saber si es par ");
    
        if(perdirNumero % 2 == 0){
            alert(perdirNumero+ " ,Es un numero Par");

        } else {
            alert(perdirNumero+ " ,Es un numero Impar");
        }
}

/*

Implementa una función que muestre, por consola, la tabla de multiplicar de un número 
solicitado al usuario. 

*/
function tablaMultiplicar(){
    let pedirNumero = prompt("Introudce el numero el cualquieras saber la tabla");

    for(let i = 0; i < 10; i++) {
        console.log(pedirNumero * i);
    }

}


/*

Implementa una función llamada calcularPrecioFinal que: 
 Reciba como parámetro el precio de un artículo y el tipo de IVA que se le 
va a aplicar.  
 Para el tipo de IVA se pasará una G si se trata del tipo General, una R si se 
trata del reducido y una S si se trata del súper reducido. 
 La función realizará el cálculo, aplicando el IVA que corresponda 
dependiendo del tipo indicado, y devolverá el importe final con el 
impuesto ya aplicado. 
 La ejecución de la función se desencadenará cuando el usuario pulse el botón 
Pagar. Para ello: 
 Se capturará en el botón el evento onclick, que cuando ocurra dicho 
evento se llamará a una función inicial llamada pagar. 
 La función Pagar no tendrá argumentos ni devolverá ningún valor. 
 Ésta función pedirá al usuario(recuerda, prompt()) que introduzca el precio 
del artículo, y después le pedirá el tipo de IVA. 
 Con esos dos valores llamará a la función calcularPrecioFinal. 
 Se mostrará al usuario el precio final mediante un alert(). 

*/

function pagarIva(){
    let precioProducto = prompt("Introduce el precio del Producto:");
    let introduceIva = prompt("Introduce el IVA a calcular"); 
    let ivaDespues = 0;

    console.log(introduceIva);

        if(introduceIva == "G"){
             ivaDespues = 0.21;

        } else if (introduceIva == "R"){
                ivaDespues = 0.10;
        } else if (introduceIva = "S"){
            ivaDespues = 0.04;
        }
    console.info(ivaDespues);
            // el mas 1 hay que ponerlo si no se suma el IVA
    let totalPrecio = alert(precioProducto *(1+ ivaDespues));
}

function pagar(){
    pagarIva();
}
////// repaso slice /// while
function Slice(){
    let frutas = ["Manzana","Pera", "Apple", "Banana","Diablo","Limon"];
        // No modifica el array
    let subArray = frutas.slice(1,2);
    console.log(subArray);
    console.log(frutas);

    // SPLICE si modifica el array
    let eliminados = frutas.splice(1,2);
    console.log(frutas);
    console.log(eliminados);
    console.log(frutas);

    let numero1 = 100;
    while(numero1 > 50) {
        numero1-+
        console.log(numero1);
    }
}