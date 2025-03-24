


/*

Utilizando las propiedades y métodos DOM que hemos visto, introduce en el
documento creado una lista ordenada con los valores Uno, Dos y Tres.
 Una vez creada la lista y mostrada en el documento, sustituye el elemento Tres por
un elemento que muestre el valor Cuatro.
 Dentro del elemento Cuatro, añadirle un hijo de tipo párrafo con el texto “Soy hijo
de Cuatro”.
 Cambiar el contenido del título por “He creado una lista”


*/
function ejercicio11() {
    // Crear la lista ordenada
    let lista = document.createElement("ol");
    lista.id = "miLista"; // Asignar ID

    // Crear los elementos <li> y agregarlos a la lista
    let item1 = document.createElement("li");
    item1.innerText = "Uno";
    lista.appendChild(item1);

    let item2 = document.createElement("li");
    item2.innerText = "Dos";
    lista.appendChild(item2);

    let item3 = document.createElement("li");
    item3.innerText = "Tres";
    item3.id = "tres"; // Id para cambiar el tres
    lista.appendChild(item3);

    document.body.appendChild(lista); // asi se ves la lista en el html
}

function ejercicio11_2() {
    // Obtener la lista
    let lista = document.getElementById("miLista");

    // Obtener todos los elementos <li>
    let items = lista.getElementsByTagName("li");

    // Crear un nuevo elemento <li> con "Cuatro"
    let nuevoItem = document.createElement("li");
    nuevoItem.innerText = "Cuatro";

    // Agregar un párrafo dentro de "Cuatro"
    let parrafo = document.createElement("p");
    parrafo.innerText = "Soy hijo de Cuatro";
    nuevoItem.appendChild(parrafo);

    // Reemplazar el tercer elemento de la lista con el nuevo elemento
    lista.replaceChild(nuevoItem, items[2]);

   
    let titulo = document.getElementsByTagName("h1")[0];
    titulo.innerText = "He creado una lista";
}

function pruebaCasa(){
    let parrafoCasa = document.getElementById("parrafo1");
    console.log(parrafoCasa);
    parrafoCasa.innerText = "Desde parrafo";
}

function creaTabla(){
    // Creo una tabla y asigno una id
    let table = document.createElement("table");
    table.id = "miTabla";
    table.border = "1";

    // añado tr a una tabla 
    let tr1 = document.createElement("tr");

    let th1 = document.createElement("th");
    th1.innerText = "Hola desde th";

    // agregto th1 a tr1
    tr1.appendChild(th1);

    // Agrego tr1 a la tabla
    table.appendChild(tr1);

    //Agrego la tabla al bodyy

    document.body.appendChild(table);
       
        
}

function creah2(){
    let crearH2 = document.createElement("h2");
    let textoUsuario = prompt("Introduce un texto para el join");
        crearH2.innerText = textoUsuario;
        document.body.appendChild(crearH2);
}

/* 
Ejercicio 12

*/

function ejercicio12(){
    // Cambiar a rojo y negrita
    let parrafo = document.getElementById("parrafo1");
     parrafo.style.color = "red";
      parrafo.style.fontWeight = "bold";

      // cambiar color de fondo de la lista ordenada 

      let lista2 = document.getElementById("miLista");
       lista2.style.backgroundColor = "yellow"; 
      lista2.style.color = "blue";

    // aplicamos estilo al titulo naranj y rosa
    let titulo = document.getElementsByTagName("h1")[0];
    titulo.style.textShadow = "3px 5px pink, 0px 2px 7px orange ";

    
    
}

// parte 2 del button
function ejercicio11_2(){
    let parrafo2 = document.getElementById("parrafo1");
    parrafo2.style.color = "yellow";
    parrafo2.style.backgroundColor = "black";
    parrafo2.style.border = "3px dashed red";

}