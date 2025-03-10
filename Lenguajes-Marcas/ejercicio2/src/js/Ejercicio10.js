function pagar() {
    var precioProducto = parseFloat(prompt("Introduce el precio del producto"));
    var pedirIva = prompt("Introduce el IVA a calcular (21% 'G'), (10% 'R'), (4% 'S')").toUpperCase();
    
    if (isNaN(precioProducto) || precioProducto <= 0) {
        alert("Por favor, introduce un precio válido.");
        return;
    }
    
    if (!["G", "R", "S"].includes(pedirIva)) {
        alert("Tipo de IVA no válido. Usa 'G' para General, 'R' para Reducido o 'S' para Súper Reducido.");
        return;
    }
    
    var precioFinal = calcularPrecioFinal(precioProducto, pedirIva);
    alert("El precio final con IVA es: " + precioFinal.toFixed(2) + "€");
}

function calcularPrecioFinal(precio, tipoIVA) {
    var iva;
    switch (tipoIVA) {
        case "G":
            iva = 0.21;
            break;
        case "R":
            iva = 0.10;
            break;
        case "S":
            iva = 0.04;
            break;
        default:
            iva = 0;
    }
    return precio * (1 + iva);
}

