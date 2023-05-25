public class Nave extends ObjetoGrafico {
    private Double velocidad;
    private Integer vida;

    public Nave(Integer posx, Integer posy, String direccion, Double velocidad,
                Integer vida) {
        super(posx, posy, direccion);

        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return super.toString()+ " Nave{" + "velocidad=" + velocidad + ", vida=" + vida + '}';
    }

    public Integer getVida() {
        return vida;
    }

    public void irA(Integer posx, Integer posy, String direccion) {
        super.irA(posx, posy,direccion);
    }

    public void girar(String direccion){
        super.setDireccion(direccion);
    }

    public void restaVida(Integer valor) {
        this.vida -= valor;
    }
}
