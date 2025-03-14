function ejercicio1(){
let pedirNumero = Number(prompt("Introduce un numero "));
let valores = [];

    for(let i = 0; i <= pedirNumero; i++){
        valores.push(i);
        

    }

        console.log(valores);


        if(valores != null){
            
            let otroNumero = Number(prompt("Introduce un numero entre 0 y "+pedirNumero));
            let  numeroEntre =  Number(prompt("Introduce un numero del 1 al 5"));

           let valoresEliminados = valores.splice(otroNumero,numeroEntre);
           let arrayEliminador = [];

           arrayEliminador.push(valoresEliminados);
           console.warn(arrayEliminador);
            console.log(valores);

            alert(valores.length+" Esa es la cantidad de elementos que quedan");
            alert("Se han eliminado todos los números");

        } else {
            console.warn("Hay algo mal");
        }

    }