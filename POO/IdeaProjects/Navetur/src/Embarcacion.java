public  abstract class  Embarcacion {
    private Double precioBase, valorAdicional, eslora;
    private Integer anioFabricacion;
    private Capitan capitan;

    public Embarcacion(Double precioBase, Double valorAdicional, Double eslora, Integer anioFabricacion,
                       Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.capitan = capitan;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public abstract Double calcularAlquiler();
}
