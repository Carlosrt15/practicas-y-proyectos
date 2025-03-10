/*



Escribe una función que declare un array de nombres y agregue, al final del mismo, un 
nuevo nombre que pida al usuario por pantalla. Sacará por consola, a modo de error, el 
array completo.


*/

function nombresArray(){

    let arrayDeNombres = ["Carlos","Ana","Luis","Soraya","David","Hector","Miguel","Tere"];
    console.warn(arrayDeNombres+" Antes de añadir nada");
    let añadirNombre = prompt("Introduce un nombre al array");
    arrayDeNombres.push(añadirNombre);
    console.warn(arrayDeNombres);

}