package controller;

import java.util.List;

import model.IModel;
import model.ModelMemory;
import model.entities.Car;
import view.IMainView;
import view.MainTerminalView;


public class MainController {
	private IModel model;
	private IMainView mainView;
	
	public MainController() {
		this.model = new ModelMemory();
		this.mainView = new MainTerminalView();
	}
	
	public void run() {
		int option;
		
		do {
			option = mainView.mainMenu();
			switch(option) {
				case 0: // Salir
					mainView.exit();
					break;
					
				case 1: // Listar coches
					List<Car> list = model.list();
					mainView.list(list);
					break;
					
				case 2: // Añadir coche
					Car car = mainView.add();
					model.add(car);
					break;
					
				case 3: // Editar coche
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
					
				case 4: // Eliminar coche
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
					
				default:
			}
		} while (option != 0);
	}
}