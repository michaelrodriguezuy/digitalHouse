public class Tanque extends SistemaArmas implements atacar, defender{

    public Tanque(Integer energia){
        super(energia);

    }


    @Override
    public void mostrar(){};
    public void atacar(Integer ataque){};
    public void defender(){};
}
