
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