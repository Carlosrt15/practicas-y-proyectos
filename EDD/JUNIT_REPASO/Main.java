import java.util.ArrayList;
import java.util.Scanner;





public class Main {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static String mensajeSuma(int suma) {
        if (suma > 40) {
            return "El resultado de la suma es mas de 40 : " + suma;
        } else {
            return "El resultado de la suma es menor de 40 : " + suma;
        }
    }

    public static ArrayList<Integer> obtenerNumerosPares(int limite) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i <= limite; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        return pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el 1 numero");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el 2 numero");
        int numero2 = sc.nextInt();

        int suma = sumar(numero1, numero2);

        System.out.println(mensajeSuma(suma));
        System.out.println(obtenerNumerosPares(suma));
    }
}
