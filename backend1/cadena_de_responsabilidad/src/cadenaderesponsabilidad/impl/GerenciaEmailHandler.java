package cadenaderesponsabilidad.impl;

import cadenaderesponsabilidad.EmailHandler;
import model.Email;

public class GerenciaEmailHandler extends EmailHandler {
    @Override
    protected String processEmail(Email email) {
        return "El correo ha sido enviado a Gerencia";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return email.getSubject().contains("Gerencia")
                || "gerencia@colmena.com".equals(email.getTo());
    }
}
