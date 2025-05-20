const mongoose = require("mongoose");

const connection = async() => {
try{

    await mongoose.connect("mongodb://127.0.0.1:27017/bd-portafolio");

    console.log("La conexion fue correcta");

} catch(error){
    console.log(error);

    throw new Error("No se pudo establecer la conexion");
}

}

module.exports = connection;