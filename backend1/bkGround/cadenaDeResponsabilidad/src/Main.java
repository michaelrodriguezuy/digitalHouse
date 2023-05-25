public class Main {
    public static void main(String[] args) {

        Logger log1 = new TrazaLogger("traza");
        Logger log2 = new DebugLogger("debug");
        Logger log3 = new ErrorLogger("error");

        log1.setSiguienteLogger(log2);
        log2.setSiguienteLogger(log3);
        log3.setSiguienteLogger(log1);

        //log1.enviarMensaje("hola traza","traza");

        log2.enviarMensaje("hola debug", "debug");
        //log3.enviarMensaje("hola error", "error");
    }
}