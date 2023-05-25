public class Triste implements StateTamagochi{
    private Tamagochi tamagochi;

    public Triste(Tamagochi tamagochi){
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        System.out.println("Beep Beep Beep *-*-*-*-*-*-*-*-*");
    }

    @Override
    public void comer() {
        System.out.println("Beep Beep - Puajjjjj ***********");
    }

    @Override
    public void mimar() {
        this.tamagochi.setState(new Feliz(tamagochi));
    }
}
