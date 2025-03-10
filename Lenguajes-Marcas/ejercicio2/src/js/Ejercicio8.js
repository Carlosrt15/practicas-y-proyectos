function ejercicio8(){

    const month = ["Enero", "febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"];
      
    // Recorrer los 12 meses
    for(i = 0; i < 12; i++){
             console.log(month[i]);
        }

            // parte del ejercico calcular el factorial 

        alert("Introduce un numero para calcular su factorial");
        const factorial = Number(prompt("Introduce el numero"));
        console.log("numero introducido: ", factorial);

        if (factorial === 0) {
            alert("No hay factorial == 0");
            
        } else if (factorial < 0) {
            alert("No se puede calcular")


        } else {

            //calculo interativo
            let resultado = 1;

            for (let i = 1; i <= factorial; i++){
                resultado *= i;
            }
            alert("El factorial de" + factorial + " es " + resultado);
        }

                // pedir al usuario que muestre su edad 
            let edad = Number(prompt("introduce tu edad"));

            if(edad < 6){
                alert("Patrulla canina");
            } else if(edad == 7 || edad <= 13 ){
                alert("Alexa y Katie");
            } else if(edad == 13 ||edad <= 18){
                alert("Anne whit an E")

                } else if(edad == 19 || edad <= 35) {
                        alert("Stranger things")
                }else{
                    alert("Sherlock")
                }

            }
                 
            

