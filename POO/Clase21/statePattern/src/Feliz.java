public class Feliz implements StateTamagochi{
    private Tamagochi tamagochi;

    public Feliz(Tamagochi tamagochi){
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        this.tamagochi.setState(new Hambriento(tamagochi));
    }

    @Override
    public void comer() {
        tamagochi.setState(new Sediento(tamagochi));
    }

    @Override
    public void mimar() {
        System.out.println("Estoy Feliz y los mimos no me cambian de estado");
    }
}
