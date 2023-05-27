public class TrazaLogger extends Logger{

    public TrazaLogger(String tipo) {
        super(tipo);
    }

    @Override
    public void enviarMensaje(String mensaje, String tipo){
        if (tipo.equals(this.tipo)) {
            System.out.println("Escribiendo en un archivo de texto: "+ mensaje);
        }
        if (getSiguienteLogger() != null ) {

            getSiguienteLogger().enviarMensaje(mensaje, tipo);

        }
    }

}
