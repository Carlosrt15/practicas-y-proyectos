window.onload = function ejercicio14(){

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

}