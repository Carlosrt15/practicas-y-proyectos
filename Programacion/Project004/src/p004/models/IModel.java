package p004.models;

import java.sql.SQLException;
import java.util.List;

import p004.models.entities.Personal;
import p004.models.entities.Room;



public interface IModel {

	List<Room> list1() throws SQLException;
	
	
	

}
