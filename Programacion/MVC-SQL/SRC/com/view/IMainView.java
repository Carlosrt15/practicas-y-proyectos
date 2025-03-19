package view;

import java.util.List;

import model.entities.Car;



public interface IMainView {

	int mainMenu();

	void exit();

	void list(List<Car> list);

	Car add();

	String selectPlateCar();

	Car editCar(Car carForEdit);

	void showError(Exception e);
	
	Car addCarToDatabase();


}
