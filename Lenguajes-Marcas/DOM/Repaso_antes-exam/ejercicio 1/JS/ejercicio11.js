function crearLista() {

// Crear el elemento <ol>
let crearLista = document.createElement("ol");
document.body.appendChild(crearLista);


 
//Crear elemento li
let crearLi1 = document.createElement("li");
let crearLi2 = document.createElement("li");
let crearLi3 = document.createElement("li");
crearLi1.textContent = "Uno";
crearLi2.textContent = "Dos";
crearLi3.textContent = "Tres";

 // Insertar el <li> dentro del <ol>
 crearLista.appendChild(crearLi1);
 crearLista.appendChild(crearLi2);
 crearLista.appendChild(crearLi3);
 crearLi3.id = "l3";
}

function cambioDeElemento(){
    //Cambia el 3 por el 4
    let tomarL3 = document.getElementById("l3");
    tomarL3.textContent = "Cuatro";

    let crearHijo = document.getElementById("l3");

    // Crear el parrafo 
    let crearParrafo = document.createElement("p");
    crearParrafo.id = "parrafo";
    crearParrafo.textContent = " Soy hijo de Cuatro";
    crearHijo.appendChild(crearParrafo );

        
}

function cambiarTitulo() {
    //Cambia el titulo de la web
    let tomarTitle = document.getElementsByTagName("title")[0];
    tomarTitle.textContent = "He creado una lista";

    

    
}



function primerBoton() {
    let tomarBoton1 = document.getElementsByTagName("button")[0];

    // Cambiar el parrafo

    let tomarParrafo = document.getElementById("parrafo");
    tomarParrafo.setAttribute("class","boton1");


    // cambiar fondo a los elementos ordenados 
    let tomarLi1  = document.getElementsByTagName("li")[0];
    let tomarLi2  = document.getElementsByTagName("li")[1];
    let tomarLi3  = document.getElementsByTagName("li")[2];


    tomarLi1 .setAttribute("class","boton1_elemnt");
    tomarLi2 .setAttribute("class","boton1_elemnt");
    tomarLi3.setAttribute("class","boton1_elemnt");


    // Sombrear el titulo
     let obtenTitulo = document.getElementsByTagName("h1")[0];
     obtenTitulo.setAttribute("class","titulo");


}

function segundoBoton(){
    // Cambiar el parrafo por segunda vez
    let tomarParrafo = document.getElementById("parrafo");
    tomarParrafo.setAttribute("class","boton2_p");




    // cambiar estilo de la lista
    let tomarLi1  = document.getElementsByTagName("li")[0];
    let tomarLi2  = document.getElementsByTagName("li")[1];
    let tomarLi3  = document.getElementsByTagName("li")[2];

    tomarLi1.setAttribute("class","lista2");
    tomarLi2.setAttribute("class","lista2");
    tomarLi3.setAttribute("class","lista2");


    // El título será de color azul claro y cursiva.
    let tomarH2 = document.getElementsByTagName("h2")[0];
    tomarH2.setAttribute("class","titulo2");



}


function eliminarEstilos(){
    // Eliminar todos los estilos
    let  deleteTomarParrafo = document.getElementById("parrafo");
    deleteTomarParrafo.removeAttribute("class");




    // Eliminar las clases de los elementos li
    let tomarLi1 = document.getElementsByTagName("li")[0];
    let tomarLi2 = document.getElementsByTagName("li")[1];
    let tomarLi3 = document.getElementsByTagName("li")[2];


    tomarLi1.removeAttribute("class");
    tomarLi2.removeAttribute("class");
    tomarLi3.removeAttribute("class");


    // Eliminar la clase 'titulo' del título h1
    let obtenTitulo = document.getElementsByTagName("h1")[0];
    obtenTitulo.removeAttribute("class");

    let tomarH2 = document.getElementsByTagName("h2")[0];
    tomarH2.removeAttribute("class");


}