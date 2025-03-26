window.onload = function ejercicio14(){

    let pedirEdad = Number(prompt("Introduce tu edad"));

        if(pedirEdad >= 18) {

            // obtiene el formulario
            let form = document.getElementById("form");

            //Crear el campo Numero cuenta
            let crearNumCuenta = document.createElement("label");
            crearNumCuenta.textContent = "Numero de cuenta";

            let inputNumCuenta = document.createElement("input");
            inputNumCuenta.type = "text";

            form.appendChild(crearNumCuenta);
            form.appendChild(inputNumCuentaNumCuenta);
            
        }

}