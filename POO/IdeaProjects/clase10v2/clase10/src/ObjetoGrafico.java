public class ObjetoGrafico {
    private Integer posx, posy;
    private String direccion;

    public ObjetoGrafico(Integer posx, Integer posy, String direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ObjetoGrafico{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public Integer getPosx() {
        return posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if(this.direccion!=direccion){
            this.direccion = direccion;
        }
    }

    public void irA(Integer posx, Integer posy, String direccion) {
        this.posx=posx;
        this.posy=posy;
        this.direccion=direccion;
    }


}
