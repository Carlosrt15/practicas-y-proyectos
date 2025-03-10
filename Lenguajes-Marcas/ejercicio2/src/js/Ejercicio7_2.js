function listaEjercicio7() {
    // Array original con los elementos dados
    let list = ["tela", "bies", "hilo", "tijeras", "maquina de coser", "botón"];

    // Elimina el bies (índice 1) y muestra el array por consola
    list.splice(1, 1);
    console.log("Array después de eliminar el bies:", list);

    // Añade "hilo torzal" entre "hilo" y "tijeras" y muestra el array por consola
    list.splice(2, 0, "hilo torzal");
    console.log("Array después de añadir 'hilo torzal':", list);

    // Encuentra el índice de "tijeras" y sustituye "tijeras" por "cúter rotatorio" y "mesa de corte"
    let postijeras = list.indexOf("tijeras");
    list.splice(postijeras, 1, "cúter rotatorio", "mesa de corte");
    console.log("Array después de sustituir tijeras:", list);

    // Crea dos nuevos arrays: uno con los tres primeros elementos y el otro con los del cuarto al sexto
    let array1 = list.slice(0, 3); 
    let array2 = list.slice(3); 

    // Modifica el segundo array: añade "remalladora" en la primera posición
    array2.splice(0, 0, "remalladora");

    
    array2.splice(array2.length - 1, 0, "cinta métrica");

    
    console.log("Primer array:", array1);
    console.log("Segundo array:", array2);
    console.log("Array original después de las modificaciones:", list);
}
