package cadenaderesponsabilidad.impl;

import cadenaderesponsabilidad.EmailHandler;
import model.Email;

public class SpamEmailHandler extends EmailHandler {
    @Override
    protected String processEmail(Email email) {
        return "El correo es SPAM";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return true;
    }
}
