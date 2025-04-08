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
    crearParrafo.textContent = " Soy hijo de Cuatro";
    crearHijo.appendChild(crearParrafo );

        
}

function cambiarTitulo() {
    //Cmbia el titulo de la web
    let tomarTitle = document.getElementsByTagName("title")[0];
    tomarTitle.textContent = "He creado una lista";

    

}