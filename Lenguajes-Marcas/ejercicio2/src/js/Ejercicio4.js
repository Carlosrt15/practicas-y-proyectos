console.log(typeof 3); 
console.log(typeof "3"); 
console.log(typeof 'tres'); 
console.log(typeof 3.6); 
////

console.log(parseInt("345.87"));  // 345 (Convierte a entero, truncando la parte decimal)
console.log(parseFloat("345.87")); // 345.87 (Convierte a número flotante)
console.log(parseInt('8 manzanas')); // 8 (Convierte el número antes del texto)
console.log(Number('8 manzanas')); // NaN (No puede convertir porque tiene texto adicional)
/////
console.log(typeof parseInt("345.87"));  // number
console.log(typeof parseFloat("345.87")); // number
console.log(typeof parseInt('8 manzanas')); // number
console.log(typeof Number('8 manzanas')); // NaN (typeof NaN es "number")


////

console.log(Boolean("texto")); // true (cualquier cadena no vacía es true)
console.log(Boolean("")); // false (una cadena vacía es false)
console.log(Boolean(3)); // true (cualquier número diferente de 0 es true)
console.log(Boolean(0)); // false (0 es false)
