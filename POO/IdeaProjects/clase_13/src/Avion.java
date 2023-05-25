public class Avion extends SistemaArmas implements volar, atacar, defender{

    public Avion(Integer energia){
        super(energia);

    }


    @Override
    public Integer mostrar(){return super.getEnergia();};
    public void volar(){};
    public void atacar(Integer ataque){};
    public void defender(){};
}

