function arrayVacio() {
   let array1 = []; 
   let continuar = true; 

   while (continuar) {
       
       let entrada = prompt("Introduce un número o una cadena de teexto para finalizar:");

       if (isNaN(entrada)) {
           console.log("Fin de la ejecución.");
           continuar = false;
           break;
       }

       
       let numero = parseInt(entrada);

       
       let nombre = prompt("Introduce el nombre de la persona:");

       
       let respuesta = prompt("¿Quieres añadir el valor en la lista (si/no)").toLowerCase();

    
       if (respuesta === "si") {
           if (numero >= 0) {
              
               array1[numero] = nombre;
           } else {
               
               array1.push(nombre);
           }
       } else if (respuesta === "no") {
           if (numero >= 0) {
               
               array1.splice(numero, 1);
           } else {
               
               array1.shift();
           }
       } else {
           
           console.log("Respuesta no valida. Solo 'si' o 'no' son aceptables.");
       }
      
   }

   
   console.log("Contenido final de la lista: ", array1);
}


arrayVacio();