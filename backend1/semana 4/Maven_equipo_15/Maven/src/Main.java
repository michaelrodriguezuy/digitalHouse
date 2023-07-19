import daos.ClienteDAOH2;
import entidades.Cliente;
import servicios.ClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setId(1L);
        cliente.setNombre("Javier");
        cliente.setApellido("Rabuch");

        ClienteService clienteService = new ClienteService();

        // seteamos una estrategia d persistencia
        clienteService.setClienteIDAO(new ClienteDAOH2());

        clienteService.guardarCliente(cliente);

    }
}