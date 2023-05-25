public abstract class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia){
        this.energia = energia;
    }

    public abstract void mostrar();

    /* public void atacar(Integer ataque){
        if(this.getEnergia()>= ataque){
            this.setEnergia(this.getEnergia()-ataque);
        }
    }; */

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
