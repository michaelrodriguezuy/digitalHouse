public class EmbarcacionYate extends Embarcacion implements Comparable {
    private Integer cantCamarotes;

    public EmbarcacionYate(Double precioBase, Double valorAdicional, Double eslora, Integer anioFabricacion,
                           Integer cantCamarotes, Capitan capitan) {
        super(precioBase, valorAdicional, eslora, anioFabricacion, capitan);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public String toString() {
        return "EmbarcacionYate{" +
                "cantCamarotes=" + cantCamarotes +
                '}';
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

    @Override
    public int compareTo(Object o) {
        EmbarcacionYate embarcacionYateXparametro = ((EmbarcacionYate)o);
        if (this.cantCamarotes>embarcacionYateXparametro.cantCamarotes) {
            return 1;
        } else if (this.cantCamarotes<embarcacionYateXparametro.cantCamarotes) {
            return -1;
        }
        return 0;
    }
}
