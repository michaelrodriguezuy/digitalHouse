public class DebugLogger extends Logger{

    public DebugLogger(String tipo) {
        super(tipo);
    }

    @Override
    public void enviarMensaje(String mensaje, String tipo){
        if (tipo.equals(this.tipo)) {
            System.out.println("Escribiendo en DEBUG: "+ mensaje);
        }
        else if (getSiguienteLogger() != null) {
            getSiguienteLogger().enviarMensaje(mensaje, tipo);
        }
    }
}
