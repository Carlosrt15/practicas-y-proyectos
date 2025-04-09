function crearLista() {
    let lista = document.createElement("ol");
    document.body.appendChild(lista);
  
    let i = 0; 
  
    while (true) {
      let texto = prompt("Introduce un texto (deja vacío o pulsa cancelar para terminar):");
  
      if (!texto) break; // si el usuario cancela o deja vacío, salimos
  
      let li = document.createElement("li");
      li.textContent = texto;
  
      if (i === 0) {
        // Primera iteración → insertar al principio
        lista.insertBefore(li, lista.firstChild);
      } else if (i % 2 === 0) {
        // Iteración par  → insertar en la tercera posición
        if (lista.children.length >= 2) {
          lista.insertBefore(li, lista.children[2]);
        } else {
          lista.appendChild(li); 
        }
      } else {
        // Iteraciones impares → insertar al final (o puedes hacer otra cosa)
        lista.appendChild(li);
      }
  
      i++; 
    }
  
    
    let li1 = document.createElement("li");
    let li2 = document.createElement("li");
    let li3 = document.createElement("li");
  
    li1.textContent = "Uno";
    li2.textContent = "Dos";
    li3.textContent = "Tres";
    li3.id = "l3";
  
    lista.appendChild(li1);
    lista.appendChild(li2);
    lista.appendChild(li3);
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



function ejercicio13() {



    
}