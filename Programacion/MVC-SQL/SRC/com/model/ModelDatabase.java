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
import utils.TerminalUtils;

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
            	
            // Sin terminar
            String query = "SELECT * FROM coches WHERE Marca LIKE  ? ";
            PreparedStatement ps = connection.prepareStatement(query);
           ps.setString(1, "%" + pedirMarca + "%"); // Buscar coincidencias parciales

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("Id");
                String marca = rs.getString("Marca");
                String modelo = rs.getString("Modelo");
                String consumo = rs.getString("Consumo");
                String emisiones = rs.getString("Emisiones");
              
                Car car = new Car(id, marca, modelo, consumo, emisiones);
                TerminalUtils.output(car.toString());
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
    
    public void insertarCoche(Car car) {
        String query = "INSERT INTO coches (Id, Marca, Modelo, Consumo, Emisiones, Imagen) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, car.getId());
            ps.setString(2, car.getMarca());
            ps.setString(3, car.getModel());
            ps.setFloat(4, Float.parseFloat(car.getConsumo())); // Dejar esto asi me da error si no
            ps.setInt(5, Integer.parseInt(car.getEmisiones())); // Dejar esto asi me da error si no
            ps.setString(6, "default.jpg"); // 

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Coche insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el coche.");
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar coche en la base de datos.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error: Consumo o Emisione no son valores numéricos válidos.");
            e.printStackTrace();
        }
    }
    
    // para hacer update 
    public void actualizarCoche(Car car) {
    	String query = "UPDATE coches SET Marca = ?, Modelo = ?, Consumo = ?, Emisiones = ? WHERE Id = ?";
        
    	// Continuar Por aqui!!!!!
    	 //try (Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD)); // Continuar Por aqui!!!!!
    }


	public void run() {
		// TODO Auto-generated method stub
		
	}
}