const project = require("../models/project");
const Project = require("../models/project");

const save = (req, res) => {

    let body = req.body;


    // Validar datos
    if(!body.name || !body.description || !body.state){
            return res.status(400).send({
                status: "error",
                message: "Faltan datos por enviar"
            });
    }
      
    //Crear objeto
    let projectoToSave = new Project(body);

    //Guardo objeto en db
projectoToSave.save().then(project => {

    if(!project){
        return res.status(404).send( {
        status: "error",
       message : "El proyecto no fue guardado bien"
       

    });


    }

    return res.status(200).send( {
        status: "succes",
        project
       

    });

}).catch(error =>{
    return res.status(500).send( {
        status: "error",
        message: "Error al guardar el proyecto",
        error

    });

});

    

}

module.exports = {
    save

} 