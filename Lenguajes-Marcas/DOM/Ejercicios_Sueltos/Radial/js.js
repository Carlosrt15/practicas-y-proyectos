
function ejercicoNum() {
    let pedirNum =  Number(prompt("introduce un numero del 1 al  18"));

    let mal = [1,2,3,4,5,18,7,8,9,10,12,13,14,15,16,17];
    let bien  = [6];

    if (bien.includes(pedirNum)) {
        alert("acertaste el numero correcto es: "+ bien);
    } else {
        alert("No esta bien ");
    }

    ejercicoNum();



}



/* 
Crear una calculadora que pida 2 numeros por pantalla 
Los sume , reste , multiplique e divida
*/

function calculadora() {

    let pedirNum1 = Number(prompt("Introduce el primer numero "));

    let pedirNum2 = Number(prompt("Introduce el segundo numero "));

        let suma = pedirNum1 + pedirNum2;
        let resta = pedirNum1 - pedirNum2;
        let  multi = pedirNum1 + pedirNum2;
        let dividir = pedirNum1 / pedirNum2;

        alert(suma, resta, multi, dividir);
        console.log(suma, resta,multi,dividir);


}