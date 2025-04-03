function arrayEnDos(){

let pares = [];
let impares = [];




for (let i = 0; i < 3; i++) {
    let pedirNumeros = Number(prompt("Introduce un numero del 1 al 100 :"+i+ "<= numeros introducidos"));

    if(pedirNumeros %2 == 0) {
        pares.push(pedirNumeros);

    } else {

        impares.push(pedirNumeros);
    }

}
console.log(pares);
console.log(impares);

alert(pares.length+" pares");
alert(impares.length+" impares");




}


function limaOnclick() {
    

}