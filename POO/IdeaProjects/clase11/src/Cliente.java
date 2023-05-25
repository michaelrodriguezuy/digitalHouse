public class Cliente {
    private Integer numeroCliente;
    private String apellido, DNI, CUIT;

    public Cliente(Integer numeroCliente, String apellido, String DNI, String CUIT) {
        
        if (apellido==null) {
            throw new RuntimeException("El apellido no puede ser nulo");
        }

        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    public String getApellido() {
        return apellido;
    }
}
