function calcularIva(){
    alert("Introduce el precio del producto para calcular el total con el IVA aplicado");

    let precio = prompt("Introduce el Precio");

    // Convertimos el precio a un número
    precio = parseFloat(precio);

    alert("Escribe 1 (21%), 2 (10%), 3 (4%) para saber que porcentaje se debe aplicar ");
    let impuesto = prompt("1 (21%), 2 (10%), 3 (4%)");   

    switch (impuesto) {
        case "1": // 21% IVA
            let rAlto = precio * 0.21;
            alert("El precio total es: " + (precio + rAlto));
            break;
        
        case "2": // 10% IVA
            let rMedio = precio * 0.10;
            alert("El precio total es: " + (precio + rMedio));
            break;

        case "3": // 4% IVA
            let rBajo = precio * 0.04;
            alert("El precio total es: " + (precio + rBajo));
            break;

        default:
            alert("Opción no válida.");
            break;
    }
}
