/*
Comprobar si un número es positivo o negativo 

Realizar una función que:  
a. Pida un número por pantalla.  
b. Dependiendo de si el número es positivo, negativo o nulo, mostrará al usuario el 
mensaje “El número es positivo”, “El número es negativo” o “El número es nulo”. 


*/

function compruebaNumero(){
   let pedirNumero =  Number(prompt("Introduce un numero por pantalla"));

   if(pedirNumero > 0){
        alert("Es positivo");

   } else if (pedirNumero < 0){
    alert("Es negativo");

   }else{
    alert("El numero es negativo");
   }
    

}