package business;

import cadenaderesponsabilidad.EmailHandler;
import cadenaderesponsabilidad.ManagerEmailHandler;
import cadenaderesponsabilidad.SalesEmailHandler;
import cadenaderesponsabilidad.SpamEmailHandler;
import cadenaderesponsabilidad.TechSupportEmailHandler;

public class EmailProcessorYCompany {

    public EmailProcessorYCompany(){

        EmailHandler receiver3 = new ManagerEmailHandler();
        EmailHandler receiver2 = new SalesEmailHandler();
        EmailHandler receiver4 = new SpamEmailHandler();

        receiver2.setSuccesor(receiver3);
        receiver3.setSuccesor(receiver4);

    }
}
