/*

Implementa un programa que pida al usuario el nombre, edad y ciudad de nacimiento de 
10 personas. Esta información se almacenará en un array de objetos (cada objeto 
representa a una persona con las propiedades nombre, edad y ciudad). Se mostrará al 
usuario, mediante un alert, todas las ciudades del array y se le pedirá que elija una. Se 
sacará por consola el nombre de todas las personas mayores de 25 años que viven en 
dicha ciudad.

*/

function personasArray(){

let personas = [];

// Solicitar 10 personas
for(let i =0; i< 10; i++)  {
    let nombre = prompt("Intorduce el nombre de la perosna " + (i+ 1));
    let edad = parent(prompt("Introduce la edad de " + nombre));
    let ciudad = prompt("Introduce la ciudad de nacimiento de " + nombre);
        //Almacenar las persona como objeto

        personas.push({ nombre , edad, ciudad })
        
  }

    // Mostrar las ciudades únicas 

    



}