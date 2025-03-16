import controller.MainController;
import model.ModelDatabase;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hola Mundo");

        MainController mainController = new MainController();
        mainController.run();


        System.out.println("Llamando a la DB");
        ModelDatabase database = new ModelDatabase();
    }
    
}