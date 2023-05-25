public abstract class Logger {

    public static String ERROR = "error";
    public static String DEBUG = "debug";
    public static String TRAZA = "traza";
    protected Logger siguienteLogger;
    protected String tipo;

    public Logger() {

    }

    public Logger(Logger siguienteLogger) {
        this.siguienteLogger = siguienteLogger;
    }

    public Logger getSiguienteLogger() {
        return siguienteLogger;
    }

    public void setSiguienteLogger(Logger siguienteLogger) {
        this.siguienteLogger= siguienteLogger;
    }



    public abstract void enviarMensaje(String mensaje, String tipo);


}
