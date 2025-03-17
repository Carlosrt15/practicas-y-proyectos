package model.entities;

public class Car {
    private String plate;
    private String model;
    private int id;
    private String marca;
    private String consumo;
    private String emisiones;

    public Car(String plate, String model) {
        super();
        this.plate = plate;
        this.model = model;
    }

    public Car(int id, String marca, String modelo, String consumo, String emisiones) {
        this.id = id;
        this.marca = marca;
        this.model = modelo;
        this.consumo = consumo;
        this.emisiones = emisiones;
    }

    @Override
    public String toString() {
        return this.plate + " - " + this.model;
    }

    @Override
    public Car clone() {
        return new Car(this.plate, this.model);
    }

    // Getters y Setters para los nuevos atributos
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
