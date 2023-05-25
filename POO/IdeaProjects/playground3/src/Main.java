import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese numero 2: ");
        int numero2 = sc.nextInt();

        if (esDivisible(numero1,numero2)) {
            System.out.println("El numero 1 es divisible entre el 2");
        }
        else {
            System.out.println("El numero 1 NO es divisible entre el 2");
        }

        Socio socio = new Socio("pepe", 45);

        System.out.println("El socio creado es: " + socio.toString());
    }



    public static boolean esDivisible (int Numero1, int Numero2) {
        if ( Numero1 % Numero2 == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }
}