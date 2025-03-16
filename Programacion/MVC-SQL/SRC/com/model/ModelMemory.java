package model;

import java.util.ArrayList;
import java.util.List;

import model.entities.Car;



public class ModelMemory implements IModel {

	private List<Car> list;
	
	public ModelMemory() {
		list = new ArrayList<>();
	}
	
	@Override
	public List<Car> list() {
		return list;
	}

	@Override
	public void add(Car car) {
		list.add(car);
	}

	@Override
	public Car findByPlate(String plateForEdit) {
		Car car = null;
		
		for(Car i : list) {
			if(i.getPlate().equals(plateForEdit)) {
				car = i.clone();
			}
		}
		
		return car;
	}

	@Override
	public void editCar(String plateForEdit, Car modifiedCar) throws Exception {
		Car findCar = null;
		for(Car car : list) {
			if(car.getPlate().equals(plateForEdit)) {
				findCar = car;
			}
		}
		
		if(findCar == null) {
			throw new Exception("Car not found");
		}

		int indexOfCar = list.indexOf(findCar);
		
		list.set(indexOfCar, modifiedCar);
	}
	
	public void editCar1(String plateForEdit, Car modifiedCar) throws Exception {
		 // Opcion 1
		 for(Car car : list) {
			if(car.getPlate().equals(plateForEdit)) {
				car.setPlate(modifiedCar.getPlate());
				car.setModel(modifiedCar.getModel());
			}
		}
	}
	
	public void editCar2(String plateForEdit, Car modifiedCar) throws Exception {

		int indexOfCar = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPlate().equals(plateForEdit)) {
				indexOfCar = i;
			}
		}
		
		if(indexOfCar == -1) {
			throw new Exception("Car not found");
		}

		list.set(indexOfCar, modifiedCar);
	}

	@Override
	public void removeCar(Car carForRemove) throws Exception {
		int indexOfCar = -1;
		for(Car car : list) {
			if(car.getPlate().equals(carForRemove.getPlate())) {
				indexOfCar = list.indexOf(car);
			}
		}

		if(indexOfCar == -1) {
			throw new Exception("Car not found");
		}
		
		list.remove(indexOfCar);
	}
	public void removeCar2(Car carForRemove) throws Exception {
		Car findCar = null;
		for(Car car : list) {
			if(car.getPlate().equals(carForRemove.getPlate())) {
				findCar = car;
			}
		}

		if(findCar == null) {
			throw new Exception("Car not found");
		}
		
		list.remove(findCar);
	}
}
