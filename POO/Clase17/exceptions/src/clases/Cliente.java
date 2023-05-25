package clases;

import exception.ClienteException;

public class Cliente {
    private String nombre, apellido, dni;
    private Double deuda, limite;


    public Cliente(String nombre, String apellido, String dni, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
        this.deuda = 0.0;
    }

    public void comprar(Double valorCompra) throws ClienteException {
        Double valorTotalDeuda = this.deuda + valorCompra;
        if(valorTotalDeuda > limite){
            throw new ClienteException("El cliente esta tratando de comprar mas del limite permitido - " + this.getClass().getName());
        }
        this.deuda = valorTotalDeuda;
    }

    public void saldarDeuda(Double valorDePago) throws ClienteException{
        if (this.deuda < valorDePago){
            throw new ClienteException("El cliente esta pagando mas que el valor de su deuda");
        }
        this.deuda = this.deuda - valorDePago;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", deuda=" + deuda +
                ", limite=" + limite +
                '}';
    }
}
