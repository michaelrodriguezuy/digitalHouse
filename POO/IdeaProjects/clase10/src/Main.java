public class Main {
    public static void main(String[] args) {

        /*ObjetoGrafico og = new ObjetoGrafico(4,5,"N");*/

        Nave nave1 = new Nave(8,9,"S",120.0,12);
        Asteroide aster1 = new Asteroide(8,7,"N",10);

        /*System.out.println(og.toString());
        System.out.println("*******************"); */
        System.out.println("Nave: "+nave1.toString());
        System.out.println("Asteroide: "+aster1.toString());

        //movimiento de nave
        System.out.println("La nave se ha movido a la misma posicion del asteroide");
        nave1.irA(8,7,"N");

        //busca posiciones

        if (nave1.getPosx() ==aster1.getPosx() && nave1.getPosy() == aster1.getPosy() && nave1.getDireccion().equals(aster1.getDireccion())){
            System.out.println("Se ha producido un choque");
            nave1.restaVida(aster1.getLesion()); //resta el valor lesion a la vida de la nave
            System.out.println("La vida de la nave es: " + nave1.getVida());
        }

    }
}