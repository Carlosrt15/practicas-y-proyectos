/*

Crea una función que cree un array y lo complete con números que vaya pidiendo al
usuario. Cuando el usuario introduzca una letra cualquiera, el programa recorrerá el array
creado y mostrará uno a uno, por consola a modo de warning, aquellos números que sean
pares

*/


function numeroArray(){
    let array = [];


    while(true){
    
    let pedirNumero = prompt("Introduce numeros (añadir una letra terminara el proceso)");
        
    if(isNaN(pedirNumero)){
        alert("Proceso terminado . Los numero introducidos son" +array.join(", "));
        break;
    }
        array.push(Number(pedirNumero));







    }


}