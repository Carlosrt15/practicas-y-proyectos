
// Función para gestionar usuario
function gestionarUsuario() {
      let nombre = prompt("Introduce tu nombre");
      
      if (!nombre) {
           console.warn("El Nombre está vacío");
           alert("No introduciste bien el nombre");
      } else {
           alert("Bien tu nombre es: " + nombre);
           let confirmacion = confirm(nombre + " ¿Es tu nombre?");
           if (confirmacion == true) {
               console.log("El nombre es correcto");
               alert("Bienvenido");
           } else {
               console.warn("No se sabe su nombre");
           }
      }
   } 
   