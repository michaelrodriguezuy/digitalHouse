package exception;

public class ClienteException extends Exception{

    public ClienteException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Error en ClienteException: " + " Mensaje: " + this.getMessage();
    }
}
