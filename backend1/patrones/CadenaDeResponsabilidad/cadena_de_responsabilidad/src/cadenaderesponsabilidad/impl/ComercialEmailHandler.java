package cadenaderesponsabilidad.impl;

import cadenaderesponsabilidad.EmailHandler;
import model.Email;

public class ComercialEmailHandler extends EmailHandler {
    @Override
    protected String processEmail(Email email) {
        return "El correo ha sido enviado al departamento comercial";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return email.getSubject().contains("Comercial")
                || "comercial@colmena.com".equals(email.getTo());
    }
}
