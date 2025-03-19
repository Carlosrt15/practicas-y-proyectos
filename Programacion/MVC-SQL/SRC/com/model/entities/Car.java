package model.entities;

public class Car {
    private String plate;
    private String model;
    private int id;  // El id debe estar correctamente inicializado
    private String marca;
    private String consumo;
    private String emisiones;

    // Constructor sin ID, para la creación inicial
    public Car(String plate, String model) {
        this.plate = plate;
        this.model = model;
        // El id se puede dejar en cero (valor por defecto)
    }

    // Constructor con ID (este es el más adecuado cuando ya tienes el ID de la base de datos)
    public Car(int id, String marca, String modelo, String consumo, String emisiones) {
        this.id = id;  // Aquí asignas el ID que viene de la base de datos
        this.marca = marca;
        this.model = modelo;
        this.consumo = consumo;
        this.emisiones = emisiones;
    }

    @Override
    public String toString() {
        // Aquí puedes mostrar el id, para tener una salida más clara en el sistema
        return "ID: " + this.id + " - " + this.marca + " - " + this.model;
    }

    // Método clone que crea un nuevo Car
    @Override
    public Car clone() {
        return new Car(this.id, this.marca, this.model, this.consumo, this.emisiones);  // Usamos todos los atributos
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getEmisiones() {
        return emisiones;
    }

    public void setEmisiones(String emisiones) {
        this.emisiones = emisiones;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
