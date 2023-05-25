public class Sediento implements StateTamagochi{
    private Tamagochi tamagochi;

    public Sediento(Tamagochi tamagochi){
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        tamagochi.setState(new Feliz(tamagochi));
    }

    @Override
    public void comer() {
        tamagochi.setState(new Triste(tamagochi));
    }

    @Override
    public void mimar() {
        System.out.println("Esto demuestra que si estoy sediento y me dan amor no sirve nada.");
    }
}
