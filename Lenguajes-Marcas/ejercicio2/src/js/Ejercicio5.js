function comprobarOperadores() {
   
    let var1 = "5";
    let var2 = "10";

    // Comparaciones entre var1 y var2 (ambas cadenas de texto)
    alert("Comparaciones entre var1 y var2 (cadenas de texto):\n" +
        "var1 == var2: " + (var1 == var2) + "\n" +
        "var1 != var2: " + (var1 != var2) + "\n" +
        "var1 < var2: " + (var1 < var2) + "\n" +
        "var1 > var2: " + (var1 > var2) + "\n" +
        "var1 <= var2: " + (var1 <= var2) + "\n" +
        "var1 >= var2: " + (var1 >= var2));

    let var3 = 5;
    let var4 = "5";

    // Comparaciones entre var3 (número) y var4 (cadena de texto que contiene un número)
    alert("\nComparaciones entre var3 (número) y var4 (cadena de texto):\n" +
        "var3 == var4: " + (var3 == var4) + "\n" +  
        "var3 === var4: " + (var3 === var4)); 

    // Declaración de las variables numéricas var5, var6 y var7
    let var5 = 3;
    let var6 = 7;
    let var7 = 10;

    
    alert("\nComparaciones entre var5, var6 y var7 (números):\n" +
        "var5 < var6 y var6 < var7: " + (var5 < var6 && var6 < var7) + "\n" +
        "var5 <= var6 y var6 > var7: " + (var5 <= var6 && var6 > var7));

    
    var7 = !true;
    alert("\nEl valor de var7 después de asignar !true: " + var7);
}
