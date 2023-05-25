public class Main {
    public static void main(String[] args) {
        SistemaArmas robocop = new RobotLiviano(100);

        ((RobotLiviano) robocop).atacar(20);

        System.out.println("La energia luego del golpe es de "+ robocop.mostrar());
    }
}