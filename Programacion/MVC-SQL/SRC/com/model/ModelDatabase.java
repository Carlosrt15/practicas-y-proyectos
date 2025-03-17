package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.entities.Car;

public class ModelDatabase {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "PracticaRoot";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/vehiculos?ssl=false";

    public List<Car> consultarCoches() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la marca deseada: ");
        String pedirMarca = sc.nextLine();
        
        List<Car> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexión abierta a la base de datos.");

            String query = "SELECT * FROM coches WHERE Marca LIKE ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, "%" + pedirMarca + "%"); // Buscar coincidencias parciales

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("Marca");
                String modelo = rs.getString("Modelo");
                String consumo = rs.getString("Consumo");
                String emisiones = rs.getString("Emisiones");
                Car car = new Car(id, marca, modelo, consumo, emisiones);
                list.add(car);
            }

            rs.close();
            ps.close();
            connection.close();
            System.out.println("Conexión cerrada.");

        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de SQL.");
            e.printStackTrace();
        } finally {
            
        }

        return list;
    }

    public void mostrarCoches() {
        List<Car> coches = consultarCoches();
        if (coches.isEmpty()) {
            System.out.println("No se encontraron coches con la marca especificada.");
        } else {
            System.out.println("Coches encontrados:");
            for (Car car : coches) {
                System.out.println(car);
            }
        }
    }

	public void run() {
		// TODO Auto-generated method stub
		
	}
}

