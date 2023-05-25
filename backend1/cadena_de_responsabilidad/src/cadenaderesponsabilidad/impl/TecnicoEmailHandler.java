package cadenaderesponsabilidad.impl;

import cadenaderesponsabilidad.EmailHandler;
import model.Email;

public class TecnicoEmailHandler extends EmailHandler {
    @Override
    protected String processEmail(Email email) {
        return "El correo ha sido enviado al área técnica";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return email.getSubject().contains("Técnica")
                || "tecnica@colmena.com".equals(email.getTo());
    }
}
