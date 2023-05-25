public abstract class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia){
        this.energia = energia;
    }

    public abstract Integer mostrar();

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
