package servicios;

import daos.IDAO;
import entidades.Cliente;

import java.util.List;

public class ClienteService {

    private IDAO<Cliente> clienteIDAO;

    public IDAO<Cliente> getClienteIDAO() {
        return clienteIDAO;
    }

    public void setClienteIDAO(IDAO<Cliente> clienteIDAO) {
        this.clienteIDAO = clienteIDAO;
    }

    public Cliente guardarCliente(Cliente c){
        // delega la responsabilidad al dao
        return clienteIDAO.guardar(c);
    }

    public void eliminarCliente(Long id){
        clienteIDAO.eliminar(id);
    }

    public Cliente buscarCliente(Long id){
        return clienteIDAO.buscar(id);
    }

    public List<Cliente> buscarTodos(){
        return clienteIDAO.buscarTodos();
    }

}
