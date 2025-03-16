package view;

import java.util.List;

import model.entities.Car;
import utils.TerminalUtils;



public class MainTerminalView implements IMainView {
	

	@Override
	public int mainMenu() {
		int option;
		
		TerminalUtils.output("Menú de concesionario");
		TerminalUtils.output("================");

		TerminalUtils.output("1.- Listar coche");
		TerminalUtils.output("2.- Añadir coche");
		TerminalUtils.output("3.- Editar coche");
		TerminalUtils.output("4.- Eliminar coche");
		TerminalUtils.output("0.- Salir");
		
		try {
			option = TerminalUtils.inputInt();
		} catch (Exception e) {
			option = -1;
		}
		
		return option;
	}

	public void exit() {
		TerminalUtils.output("Adios");
	}

	@Override
	public void list(List<Car> list) {
		TerminalUtils.output("Lista de coches");
		TerminalUtils.output("Matricula - Modelo");
		
		for(Car car : list) {
			TerminalUtils.output(car.toString());
		}
	}
	
	@Override
	public Car add() {
		TerminalUtils.output("Nuevo coche");
		TerminalUtils.output("================");

		TerminalUtils.output("Introduzca la matrícula");
		String plate = TerminalUtils.inputText();

		TerminalUtils.output("Introduzca el modelo");
		String model = TerminalUtils.inputText();
		
		Car car = new Car(plate, model);
		return car;
	}
	
	@Override
	public String selectPlateCar() {
		TerminalUtils.output("Introduzca la matrícula");
		String plate = TerminalUtils.inputText();
		return plate;
	}

	@Override
	public Car editCar(Car carForEdit) {
		TerminalUtils.output("Editar coche");
		TerminalUtils.output("================");

		TerminalUtils.output("Introduzca la nueva matrícula (si lo deja vacío no se modificará)");
		String plate = TerminalUtils.inputText();
		if(isValidString(plate)) {
			carForEdit.setPlate(plate);
		}

		TerminalUtils.output("Introduzca el nuevo modelo (si lo deja vacío no se modificará)");
		String model = TerminalUtils.inputText();
		if(isValidString(model)) {
			carForEdit.setModel(model);
		}
		
		return carForEdit;
	}
	
	public boolean isValidString(String value) {
		return value != null && !value.isEmpty() && !value.isBlank();
	}

	@Override
	public void showError(Exception e) {
		TerminalUtils.output(e.getMessage());
	}
}
