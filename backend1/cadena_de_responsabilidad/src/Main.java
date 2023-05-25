//import business.ColombiaEmailProcessor;
import cadenaderesponsabilidad.impl.ComercialEmailHandler;
import model.Email;

public class Main {
    public static void main(String[] args) {

        //ColombiaEmailProcessor colEmailProcessor = new ColombiaEmailProcessor();
        ComercialEmailHandler colEmailProcessor = new ComercialEmailHandler();

// esto estaba comentado de antes, no lo hice yo        colEmailProcessor.processEmail(new Email("Bla bla Gerencia", "cualquiercosa@bla.com"));

        //colEmailProcessor.processEmail(new Email("Bla bla", "cualquiercosa@bla.com"));
        colEmailProcessor.handleEmail (new Email("Bla bla", "cualquiercosa@bla.com"));

    }
}