function meterNombre() {

    let tomarNombre = document.getElementsByTagName("h3")[1];
    let tomarLabel = document.getElementsByTagName("label")[0];
    let tomarForm = document.getElementsByTagName("form")[0];

        // pedir nombre usuario

     let pedirNombre = prompt("Introduzca su Nombre");

     // crear el parrafo a insertar y ponerle lo introducido
     let creaParrafo = document.createElement("p");
     creaParrafo.textContent = pedirNombre;

     //insertar el parrafo

     tomarForm.insertBefore(creaParrafo, tomarLabel);

}

function cambiarColorParrafos(){
 let tomarParrafos = document.getElementsByTagName("p");

// usar bucle para ponerselo a todos

for (let i = 0; i < tomarParrafos.length; i++) {
    tomarParrafos[i].setAttribute("class", "parrafos_c");

}

}

// Elinar atributos
function eliminarColorParrafos() {

    let  tomarParrafos = document.getElementsByTagName("p");
    for (let i = 0; i < tomarParrafos.length; i++) {
        tomarParrafos[i].removeAttribute("class");
    
    }

}

function validarFoto() {
let pedirConfirmacion = confirm("Confirma si eres mayor de edad");

if(pedirConfirmacion) {
    alert("true");
} else {
    alert("false");

}

}


