// importar libreria
const { Schema, model } = require("mongoose");
const { trim } = require("validator");




// Crear esquema (estructura de cada documento)
const ProjectSchema =  new Schema({

        name : {
            type: String,
            required: true,
            trim: true
        },
        description: {
            type: String,
            required: true
        },
        state: {
            type: String,
            required: true
        },
        image : {
            type: String,
            default: "default.png"
        },
        created_at: {
            type: Date,
            default: Date.now
        }
            
});



// Crear el modelo, indicarle la coleccion donde se van a guardar



// Exportar el modelo
module.exports = model("Project", ProjectSchema, "projects");