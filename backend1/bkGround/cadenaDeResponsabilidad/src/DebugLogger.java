public class DebugLogger extends Logger{

    public DebugLogger(String tipo){
        this.tipo =tipo;

    }

    @Override
    public void enviarMensaje(String mensaje, String tipo){
        if (tipo.equals(this.tipo)) {
            System.out.println("Escribiendo en DEBUG: "+ mensaje);
        }
        if (this.getSiguienteLogger() != null) {
            this.getSiguienteLogger().enviarMensaje(mensaje, tipo);
        }
    }
}
