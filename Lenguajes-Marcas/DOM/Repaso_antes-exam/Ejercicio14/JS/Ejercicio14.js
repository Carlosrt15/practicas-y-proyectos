function mayorEdad() {

    let preguntarEdad = confirm("¿Tienes mas de 18 años de edad?");
    

    if (preguntarEdad == true) {

        //Obtener formulario
       let form = document.getElementsByTagName("form")[0];

            //Crear el nuevo label para cuenta

       let crearLabel = document.createElement("label");
       crearLabel.textContent = "nº cuenta";

       // crear el campo para el numero de cuenta

       let inputCuenta = document.createElement("input");
       inputCuenta.setAttribute("type", "text");

      // Localizar el input de edad (el tercero)
      let inputEdad = document.getElementsByTagName("input")[2];


      // crear br 
      let br = document.createElement("br");

          // Insertar justo después del inputEdad
          form.insertBefore(br, inputEdad.nextSibling);
          form.insertBefore(crearLabel, inputEdad.nextSibling);
          form.insertBefore(inputCuenta, crearLabel.nextSibling);  
        
          


    } else {


    }
}

    //Poner el foco 
function focoPass() {
let tomarCampoContraseña = document.getElementsByTagName("input")[1];
tomarCampoContraseña.setAttribute("class","foco-pass");



} 

function agrandarNombre(){

    let tomarLabels = document.getElementsByTagName("label");
    for (let label of tomarLabels) {
        label.classList.add("labelGrande"); 
    }
    
   
}

function detenerForm(){
    let pedirConfirmacion = confirm("¿Estas seguro de enviar el formulario?");

    
        // Logica del form
    if(pedirConfirmacion ) {
        return true;

    }else {
        return false;
    }



}


