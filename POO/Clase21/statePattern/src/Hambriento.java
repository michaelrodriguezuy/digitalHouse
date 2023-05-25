public class Hambriento implements StateTamagochi{
    private Tamagochi tamagochi;

    public Hambriento(Tamagochi tamagochi){
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        tamagochi.setState(new Triste(tamagochi));
    }

    @Override
    public void comer() {
        tamagochi.setState(new Feliz(tamagochi));
    }

    @Override
    public void mimar() {
        System.out.println("Sin cambios");
    }
}
