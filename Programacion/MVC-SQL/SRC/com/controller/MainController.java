package controller;

import java.util.List;
import model.IModel;
import model.ModelMemory;
import model.ModelDatabase;
import model.entities.Car;
import view.IMainView;
import view.MainTerminalView;

public class MainController {
    private IModel model;
    private IMainView mainView;
    private ModelDatabase database;

    public MainController() {
        this.model = new ModelMemory();
        this.mainView = new MainTerminalView();
        this.database = new ModelDatabase(); // Instancia para la base de datos
    }

    public void run() {
        int option;

        do {
            option = mainView.mainMenu();
            switch(option) {
                case 0: // Salir
                    mainView.exit();
                    break;

                case 1: // Listar coches en memoria
                    List<Car> list = model.list();
                    mainView.list(list);
                    break;

                case 2: // Añadir coche en memoria
                    Car car = mainView.add();
                    model.add(car);
                    break;

                case 3: // Editar coche en memoria
                    List<Car> listForEdit = model.list();
                    mainView.list(listForEdit);

                    String plateForEdit = mainView.selectPlateCar();
                    Car carForEdit = model.findByPlate(plateForEdit);

                    Car modifiedCar = mainView.editCar(carForEdit);
                    try {
                        model.editCar(plateForEdit, modifiedCar);
                    } catch (Exception e) {
                        mainView.showError(e);
                    }
                    break;

                case 4: // Eliminar coche en memoria
                    List<Car> listForRemove = model.list();
                    mainView.list(listForRemove);

                    String plateForRemove = mainView.selectPlateCar();
                    Car carForRemove = model.findByPlate(plateForRemove);

                    try {
                        model.removeCar(carForRemove);
                    } catch (Exception e) {
                        mainView.showError(e);
                    }
                    break;

                case 5: // NUEVA OPCIÓN: Listar coches desde la base de datos
                    List<Car> dbCars = database.consultarCoches();
                    mainView.list(dbCars);
                    break;
                    
                case 6: // Insertar coche en la base de datos
                    Car newCar = mainView.addCarToDatabase();
                    database.insertarCoche(newCar);
                    break;


                default:
                    mainView.showError(new Exception("Opción no válida."));
            }
        } while (option != 0);
    }
}