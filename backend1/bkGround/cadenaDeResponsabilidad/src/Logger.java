public abstract class Logger {

    public static String ERROR = "error";
    public static String DEBUG = "debug";
    public static String TRAZA = "traza";
    protected Logger siguienteLogger;
    protected String tipo;

    public Logger getSiguienteLogger() {
        return this;
    }

    public Logger setSiguienteLogger(Logger logger) {
        this.siguienteLogger= logger;
        return this;
    }

    public abstract void enviarMensaje(String mensaje, String tipo);


}
