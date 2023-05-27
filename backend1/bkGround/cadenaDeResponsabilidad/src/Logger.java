public abstract class Logger {

    public static String ERROR = "error";
    public static String DEBUG = "debug";
    public static String TRAZA = "traza";
    protected Logger siguienteLogger;

    protected String tipo;
    public int contador;

    public Logger(String tipo) {
        this.tipo = tipo;
    }

    public Logger getSiguienteLogger() {
        return siguienteLogger;
    }

    public void setSiguienteLogger(Logger siguienteLogger) {
        this.siguienteLogger= siguienteLogger;
    }

    public abstract void enviarMensaje(String mensaje, String tipo);

}
