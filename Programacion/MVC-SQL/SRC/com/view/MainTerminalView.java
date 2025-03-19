package view;

import java.util.List;
import model.entities.Car;
import utils.TerminalUtils;

public class MainTerminalView implements IMainView {

    @Override
    public int mainMenu() {
        TerminalUtils.output("Menú de concesionario");
        TerminalUtils.output("================");

        TerminalUtils.output("1.- Listar coches en memoria");
        TerminalUtils.output("2.- Añadir coche en memoria");
        TerminalUtils.output("3.- Editar coche en memoria");
        TerminalUtils.output("4.- Eliminar coche en memoria");
        TerminalUtils.output("5.- Listar coches desde la base de datos");
        TerminalUtils.output("6. insertar  base de datos (ID, marca, modelo, consumo, emisiones)");
        TerminalUtils.output("0.- Salir");

        return TerminalUtils.inputInt();
    }

    public void exit() {
        TerminalUtils.output("Adios");
    }

    @Override
    public void list(List<Car> list) {
        TerminalUtils.output("Lista de coches");
        TerminalUtils.output("ID - Marca - Modelo");

        for (Car car : list) {
          TerminalUtils.output(car.toString());
            
        }
    }

    @Override
    public Car add() {
        TerminalUtils.output("Nuevo coche");
        TerminalUtils.output("================");

        TerminalUtils.output("Introduzca la matricula");
        String plate = TerminalUtils.inputText();

        TerminalUtils.output("Introduzca el modelo");
        String model = TerminalUtils.inputText();

        return new Car(plate, model);
    }

    @Override
    public String selectPlateCar() {
        TerminalUtils.output("Introduzca la matrícula:");
        return TerminalUtils.inputText();
    }

    @Override
    public void showError(Exception e) {
        TerminalUtils.output(e.getMessage());
    }

    @Override
    public Car editCar(Car carForEdit) {
        if (carForEdit == null) {
            TerminalUtils.output("El coche seleccionado no existe.");
            return null;
        }

        TerminalUtils.output("Editando coche con matrícula: " + carForEdit.getPlate());

        TerminalUtils.output("Introduzca el nuevo modelo (actual: " + carForEdit.getModel() + "): ");
        String newModel = TerminalUtils.inputText();

        carForEdit.setModel(newModel.isEmpty() ? carForEdit.getModel() : newModel);
        return carForEdit;
    }
    
    @Override
    public Car addCarToDatabase() {
        TerminalUtils.output("Nuevo coche para la base de datos");
        TerminalUtils.output("================");

        TerminalUtils.output("Introduzca el ID:");
        int id = TerminalUtils.inputInt();

        TerminalUtils.output("Introduzca la marca:");
        String marca = TerminalUtils.inputText();

        TerminalUtils.output("Introduzca el modelo:");
        String modelo = TerminalUtils.inputText();

        TerminalUtils.output("Introduzca el consumo (en litros cada 100km):");
        String consumo = TerminalUtils.inputText();

        TerminalUtils.output("Introduzca las emisiones (en gramos de CO2/km):");
        String emisiones = TerminalUtils.inputText();

        return new Car(id, marca, modelo, consumo, emisiones);
    }


	}
