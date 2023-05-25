import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa tu nombre:");
        String nombre = sc.next();

        System.out.println("ingresa tu apellido:");
        String apellido = sc.next();

        System.out.println("Sus iniciales son: " + nombre.charAt(0) + apellido.charAt(0));
    }
}