import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        String texto1= sc.next();
        System.out.println("Ingrese otro texto: ");
        String texto2= sc.next();

        if (!texto2.equals("")) {
            if  (comparaTextos(texto1,texto2)) {
                System.out.println("Los textos son identicos");
            }else {
                System.out.println("Los textos son distintos");
            }
        }
    }
    public static boolean comparaTextos (String text1, String text2) {
        if (text1.equals(text2)) {
            return  true;
        }
        else {
            return false;
        }
    }
}
