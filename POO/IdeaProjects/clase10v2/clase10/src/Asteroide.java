public class Asteroide extends ObjetoGrafico{
    private Integer lesion;

    public Asteroide(Integer posx, Integer posy, String direccion, Integer lesion) {

        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return super.toString()+ " Asteroide{" + "lesion=" + lesion + '}';
    }

    public Integer getLesion() {
        return lesion;
    }

    public void irA(Integer posx, Integer posy, String direccion) {
        super.irA(posx,posy,direccion);
    }
}
