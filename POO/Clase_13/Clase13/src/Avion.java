public class Avion extends SistemaArmas implements volar, atacar, defender{

    public Avion(Integer energia){
        super(energia);

    }


    @Override
    public void mostrar(){};
    public void volar(){};
    public void atacar(Integer ataque){};
    public void defender(){};
}

