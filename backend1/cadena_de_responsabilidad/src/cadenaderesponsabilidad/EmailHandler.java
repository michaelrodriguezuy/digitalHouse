package cadenaderesponsabilidad;

import model.Email;

public abstract class EmailHandler {

   private EmailHandler succesor;
   private String emailDomain;

    public EmailHandler(EmailHandler succesor) {
        this.succesor = succesor;
    }

    public EmailHandler() {
    }

    public String handleEmail(Email email){
        if(isMyResponsability(email)){
            return processEmail(email);
        }else{
            return this.succesor.handleEmail(email);
        }
    }

    protected abstract String processEmail(Email email);

    protected abstract boolean isMyResponsability(Email email);

    public void setSuccesor(EmailHandler succesor) {
        this.succesor = succesor;
    }
}
