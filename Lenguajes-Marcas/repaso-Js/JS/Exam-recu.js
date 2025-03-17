function ejercicio1(){
let pedirNumero = Number(prompt("Introduce un numero "));
let valores = [];

    for(let i = 0; i <= pedirNumero; i++){
        valores.push(i);
        

    }

        console.log(valores);


        if(valores != null ){
            
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

    // optimizar else if

    function optimizar(){
        let almacenar = [];
        let r1 = Number(prompt("1.Introduce un numero"));
        let r2 = Number(prompt("2.Introduce un numero"));
        let r3 = Number(prompt("3.Introduce un numero"));


        almacenar = [r1,r2,r3];

        if(r1 == r2 && r2 == r3){
            alert("Los 3 son iguales", r1 +r2 +r3);
        } else if(r1 == r2 || r1 == r3 || r2 == r3) {
            alert("2 numeros son iguales");
        } else {
            alert("Son todos diferentes");
        }
        alert(almacenar);

    }