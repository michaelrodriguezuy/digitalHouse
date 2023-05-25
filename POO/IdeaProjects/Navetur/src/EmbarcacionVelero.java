public class EmbarcacionVelero extends Embarcacion {

    private Integer cantMastiles;

    public EmbarcacionVelero(Double precioBase, Double valorAdicional, Double eslora, Integer anioFabricacion,
                             Integer cantMastiles, Capitan capitan) {
        super(precioBase, valorAdicional, eslora, anioFabricacion, capitan);
        this.cantMastiles = cantMastiles;
    }



    @Override
    public Double calcularAlquiler() {
        if (super.getAnioFabricacion()>2020){
            return super.getPrecioBase()+super.getValorAdicional();
        }
        else {
            return super.getPrecioBase();
        }
    }

    public Boolean esGrande() {
        return this.cantMastiles>4;
    }
}
