public class ErrorLogger extends Logger{


    @Override
    public void enviarMensaje(String mensaje, String tipo){
        if (tipo.equals(this.tipo)) {
            System.out.println("Enviando email: "+ mensaje);
        }
        if (this.getSiguienteLogger() != null) {
            this.getSiguienteLogger().enviarMensaje(mensaje, tipo);
        }
    }

}
