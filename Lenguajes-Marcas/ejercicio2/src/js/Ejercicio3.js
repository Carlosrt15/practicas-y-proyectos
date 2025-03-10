 // Ejercicio 3
 function mostrarVariables() {
     
    
    // Asignar variable2 como null y mostrarla
    variable2 = null;
    alert('Variable2: ' + variable2);
    
    
    let variable1 = 34;
    alert('Variable1: ' + variable1);
    
    
    variable3 = 15.9;
    alert('Multiplicación de variable1 y variable3: ' + (variable1 * variable3));
    
    
    variable3 = "ahora soy un texto";
    alert('Variable3: ' + variable3);
    
    // Mostrar multiplicación de variable3 y 35
    alert('Multiplicación de variable3 y 35: ' + (variable3 * 35)); 
    
   
    let objetoEjemplo = {
        nombre: "Ejemplo",
        valor: 42
    };
    alert('Valor del objeto: ' + objetoEjemplo.valor);
 }