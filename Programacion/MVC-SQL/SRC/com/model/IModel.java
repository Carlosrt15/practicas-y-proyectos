package model;

import java.util.List;

import model.entities.Car;



public interface IModel {

	List<Car> list();

	void add(Car car);

	Car findByPlate(String plateForEdit);

	void editCar(String plateForEdit, Car modifiedCar) throws Exception;

	void removeCar(Car carForRemove) throws Exception;

}
