public class LoggerService {

    private Logger firsthandler;

    public LoggerService(Logger firsthandler) {
        this.firsthandler = new ErrorLogger();

        Logger secondHandler = new TrazaLogger();
        Logger thirdHandler = new DebugLogger();

        //aca defino los siguientes logger
        this.firsthandler.setSiguienteLogger(secondHandler);
        secondHandler.setSiguienteLogger(thirdHandler);
    }

    public void CrearLog(Log log) {

    }
}
