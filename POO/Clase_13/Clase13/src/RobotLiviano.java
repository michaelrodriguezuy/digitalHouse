public class RobotLiviano extends SistemaArmas implements volar, atacar, defender {

    public RobotLiviano(Integer energia){
        super(energia);
    }


    @Override
    public void mostrar(){};
    public void volar(){};
    public void atacar(Integer ataque){
        if(super.getEnergia()>= ataque){
            super.setEnergia(super.getEnergia()-ataque);
        }
    };
    public void defender(){};


}


