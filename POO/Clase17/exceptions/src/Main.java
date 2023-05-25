import clases.Cliente;
import exception.ClienteException;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero:");
        Integer numero = 0;

        try{
            numero = sc.nextInt();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("El numero ingresado es: " + numero);
        System.out.println("pase por aca");
*/

        Cliente cliente = new Cliente("Juan","Perez","25123654", 1000.0);
        try{
            cliente.comprar(900.0);
        }catch (ClienteException e){
            System.out.println(e.toString());
        }

        System.out.println(cliente.toString());

        try{
            cliente.comprar(500.0);
        }catch (ClienteException e){
            System.out.println(e.toString());
        }

        System.out.println(cliente.toString());


    }
}