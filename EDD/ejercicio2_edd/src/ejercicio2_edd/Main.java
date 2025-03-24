package ejercicio2_edd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Fecha fecha = new Fecha();
			
			System.out.println("Formato 1 (yyyy/MM): " + fecha.devuelveFecha(1));
	        System.out.println("Formato 2 (MM/yyyy): " + fecha.devuelveFecha(2));
	        System.out.println("Formato 3 (MM/yy): " + fecha.devuelveFecha(3));
			
	}

}
