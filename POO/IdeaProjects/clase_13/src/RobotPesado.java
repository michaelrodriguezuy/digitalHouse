public class RobotPesado extends SistemaArmas implements atacar, defender {

        public RobotPesado(Integer energia){
            super(energia);

        }


        @Override
        public Integer mostrar(){return super.getEnergia();};
        public void atacar(Integer ataque){};
        public void defender(){};

}
