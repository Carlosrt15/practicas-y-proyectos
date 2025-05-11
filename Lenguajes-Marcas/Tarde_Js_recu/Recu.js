function calcular() {
    let pedirNumero = Number(prompt("Introduce un numero"));
    let resultado = "";

    for (let i = 0; i <= pedirNumero; i++) {
        if (i % 2 === 0) {
            resultado += i + " ";
        }
    }
    console.log(resultado);
}
