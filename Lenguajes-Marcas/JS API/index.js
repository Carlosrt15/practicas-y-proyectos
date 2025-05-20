//Importar depedecias
const connection = require("./database/connection");
const express = require("express");
const cors = require("cors");

// Conexion a DB
connection();

// Crear el server
const app = express();
const port = 3977;

// Configurar cors
app.use(cors());

// Convertir los datos del body a objetos
app.use(express.json());
app.use(express.urlencoded({extended: true}));

//Cargar rutas
const projectRoutes = require("./routes/project");


app.use('/api/project', projectRoutes);


// Crear endpoints

app.get("/", (req, res) => {
    console.log("la ruta raiz se ha llamado!!");

    return res.status(200).send([{
            curso: "JS",
            url: "https://carlos",
            profe: "Carlos RT"
    },
    {
            curso: "PHP",
            url: "https://Antonio",
            profe: "Antonio"
    }

    ]);
})



app.get("/pruebitas", (req, res) => {

    console.log("Se ha ejecuto el endpoint de prueba");

    return res.status(200).send(
        `<section>
            <h1>Estoy aprendiendo Node</h1>
            <h2>con el profesor de Udemy</h2>
        </section>`
    )

})
// poner el server a escuchar
app.listen(port, () => {
    console.log("Servidor esta corriendo correctamenten en el puerto: "+ port);
})