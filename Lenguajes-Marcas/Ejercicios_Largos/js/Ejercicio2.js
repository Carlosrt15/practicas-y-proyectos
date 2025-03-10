/*
    Conversor Euros a Dólares 
    Realiza una página que muestre un formulario para la conversión de Euros a Dólares 
    Americanos y viceversa.  


*/

function convertir(){
    let cantidad = Number(document.getElementById("cantidad").value);
    let conversión = document.getElementById("conversion").value;
    let resultado = document.getElementById("resultado");

    // Tasa de cambio

    let tasaEuroDolar = 1.08; // 

    let tasaDolarEuro = 1 / tasaEuroDolar;

    let montoConvertido = 0;

    if(conversión === "eur > usd"){
        montoConvertido = cantidad * tasaDolarEuro;
        resultado.textContent = `${cantidad} € son ${montoConvertido.toFixed(2)} USD`;
        
    }else {
        montoConvertido = cantidad * tasaDolarEuro;
        resultado.textContent = `${cantidad} USD son ${montoConvertido.toFixed(2)} €`;
    }

}