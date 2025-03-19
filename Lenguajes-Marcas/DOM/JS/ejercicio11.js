


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
        crearH2.innerText = "Hola desde el h2";
        document.body.appendChild(crearH2);
}