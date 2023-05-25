public class ErrorLogger extends Logger{

    public ErrorLogger(String tipo) {
        super(tipo);
    }
    @Override
    public void enviarMensaje(String mensaje, String tipo){
        if (tipo.equals(this.tipo)) {
            System.out.println("Enviando email: "+ mensaje);
        }
        else if (getSiguienteLogger() != null) {
            getSiguienteLogger().enviarMensaje(mensaje, tipo);
        }
    }

}
