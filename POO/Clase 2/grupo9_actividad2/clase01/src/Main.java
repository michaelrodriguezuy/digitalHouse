import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Ejercicio 1
//        Hacer una función que dado un número indica si es un número primo o no. Un número
//        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
//        ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
//        17.
//        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
//        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
//        obtenida en el ejercicio

        System.out.println("Ejercicio 1");
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        System.out.println(esPrimo(num));

//        Ejercicio 2
//        Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
//        Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
//        unNumeroC)
//        Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
//        el resultado.

        System.out.println("Ejercicio 2");
        System.out.println("Ingrese un número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = sc.nextInt();
        System.out.println("Ingrese otro número");
        int num3 = sc.nextInt();
        System.out.println(maximoEntreTresNumeros(num1, num2, num3));

//        Ejercicio 3
//        Escribir una función:
//        boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
//        que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
//        false, en caso de que coincidan.

        System.out.println("Ejercicio 3");
        System.out.println("Ingrese un string");
        String string1 = sc.next();
        System.out.println("Ingrese otro string");
        String string2 = sc.next();
        System.out.println(cadenasDeTextoDistintas(string1, string2));

    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if(numero % contador == 0) {
                primo = false;
            }
            contador ++;
        }
        return primo;
    }

    public static int maximoEntreTresNumeros(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static Boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
    return unTextoA.equals(unTextoB);
        }
    }
