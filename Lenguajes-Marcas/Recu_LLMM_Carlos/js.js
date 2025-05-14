function tabla(){
    let pedirNumero = Number(prompt("Introduce un numero"));
    let tablas = [];
    for(let i =0;i<=10;i++){
         let total = pedirNumero * i;
         tablas.push(total);

    } 
    alert("la tabla de multiplicar de "+pedirNumero+" :"+tablas);
}




function calcular(){
    let serie = [0,1];
    let calculo = 1;

    let numeroTope = Number(prompt("introduce"));

    if(!isNaN(numeroTope)){
        while(calculo <= numeroTope) {
            serie[serie.length] = calculo;
            calculo =serie[serie.length -1] +serie[serie.length -2];
        }
        console.log("Final:" +serie);
    } else {
        alert("No se ha introudcido un valor numerico");
    }

}

function cochesFabricadosDespuesDe(cadena1, valor1){
    cadena1 = ["2001","2002","1999","2003"]
    valor1 = true

}