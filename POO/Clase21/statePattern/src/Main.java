public class Main {
    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi("Pepe");

        System.out.println(tamagochi.getState().getClass());
        tamagochi.beber();
        System.out.println(tamagochi.getState().getClass());
        tamagochi.comer();
        tamagochi.mimar();
        tamagochi.comer();
    }
}