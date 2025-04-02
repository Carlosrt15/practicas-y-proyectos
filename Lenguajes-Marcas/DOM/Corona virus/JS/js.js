function comprobarChek() {
    let divTexto = document.getElementById("divComoActuar");

    // Obtenemos los valores de los checkboxes
    let fiebre = document.getElementById("fiebre").checked;
    let tos = document.getElementById("tos").checked;
    let respirar = document.getElementById("respirar").checked;
    let grave = document.getElementById("grave").checked;

    // Comprobamos las combinaciones de los checkboxes
    if ((fiebre || tos) && (respirar || grave)) {

        //  fiebre o tos están marcados y además respirar o grave también
        divTexto.innerHTML = "Llama al teléfono 112. Se trata de un teléfono de URGENCIAS. Su buen uso depende de todos. No llames si no es totalmente necesario";
    } else if (fiebre || tos) {

        //  solo fiebre o tos están marcados
        divTexto.innerHTML = "Quédate en casa y llama al teléfono habilitado en tu Comunidad Autónoma";
    } else {
        // Si no hay checkboxes marcados
        divTexto.innerHTML = "";
    }

    divTexto.setAttribute("class","azulOscuroNegrita");
}


function cargarTexto() {
        // Recoger el div 
    let DivParaTodos = document.getElementById("paraTodos");

    // Insertar el parrafo 
    let encabezadoParaTodos = document.createElement("h2");
    encabezadoParaTodos.innerText = "¿Como puedo Protegerme?"
    DivParaTodos.appendChild(encabezadoParaTodos);

}

function mostrarInfo() {
   
}



function ocultarInfo() {
    
}