function ejercicio14(){

    let pedirEdad = Number(prompt("Introduce tu edad"));

        if(pedirEdad >= 18) {

            // obtiene el formulario
            let form = document.getElementById("form");
            let edadInput = document.getElementById("edad");

            //Crear el campo Numero cuenta
            let crearNumCuenta = document.createElement("label");
            crearNumCuenta.textContent = "Numero de cuenta";

            let inputNumCuenta = document.createElement("input");
            inputNumCuenta.type = "text";

            form.insertBefore(crearNumCuenta, edadInput.nextElementSibling);
            form.insertBefore(inputNumCuenta, crearNumCuenta.nextElementSibling);
                        
        }


         // Contraseña se pone bluur
         let passwordInput = document.getElementById("password");

         if (passwordInput) {

             passwordInput.addEventListener("focus", function () {
                 passwordInput.classList.add("resaltado"); // aplica la clase
                 
             });

             // Restaura el borde

             passwordInput.addEventListener("blur", function() {

                 passwordInput.classList.remove("resaltado");
             });
         }

         

         // aumentar el nombre de los campos
         let labels = document.getElementsByClassName("label");

         const labelsArray = Array.from(labels);
         

         for(let i = 0; i < labelsArray.length; i++) {
            const label = labelsArray[i];

            label.addEventListener("mouseenter", () => {
                label.classList.add("label-hover");

            });

                              
           
         }




         

}


function llamarFormulario() {
    const formEnvio = document.getElementById("formenvio");
    
    formEnvio.addEventListener("submit", function(event) {
        // Prevenir el envío automático
        event.preventDefault();
        
        // Pedir confirmación
        const pedirConfirmacion = confirm("¿Estás seguro de querer enviar el formulario?");
        console.log(pedirConfirmacion); // true (Aceptar) o false (Cancelar)
        
        if (pedirConfirmacion) {
            
            this.submit();
        }
        
    });
}





