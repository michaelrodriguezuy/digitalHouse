public class SocioPileta extends Socio{

    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(Integer nroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado){
        super(nroSocio,nombre,cuotaMensual,actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    @Override
    public Double calcularCostoMensual(){
        if (this.estaHabilitado == true){
            return super.calcularCostoMensual() + this.costoPileta;
        } else{
            return super.calcularCostoMensual();
        }
    }
    public String toString(){
        return super.toString() + " costo pileta: " + this.costoPileta + " habilitado: " + this.estaHabilitado;
    }
}
