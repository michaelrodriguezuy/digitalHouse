public class Tanque extends SistemaArmas implements atacar, defender{

    public Tanque(Integer energia){
        super(energia);

    }


    @Override
    public Integer mostrar(){return super.getEnergia();};
    public void atacar(Integer ataque){};
    public void defender(){};
}
