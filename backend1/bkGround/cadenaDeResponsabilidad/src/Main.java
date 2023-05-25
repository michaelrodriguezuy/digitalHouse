public class Main {
    public static void main(String[] args) {


        Logger log = new TrazaLogger("error");

        //Logger log2 = new DebugLogger("debug");
        //Logger log3 = new ErrorLogger("error");


        //log.setSiguienteLogger(log);

        log.enviarMensaje("hola traza","traza");

        //log2.enviarMensaje("hola debug", "debug");
        //log3.enviarMensaje("hola error", "error");
    }
}