/*

Crea una página web que muestre los números 
pares del 10 al 20 (ambos incluidos), usando "while"

*/


function while1(){
    console.log("prueba");
    let numero1 = 10;
    let numero2 = 20;

    while( numero1 <= numero2){
        if(numero1 % 2 ==0){
            console.log(numero1);

        }
        numero1++;
    }

   
}