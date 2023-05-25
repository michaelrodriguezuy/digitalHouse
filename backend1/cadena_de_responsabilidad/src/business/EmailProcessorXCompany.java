package business;

import cadenaderesponsabilidad.EmailHandler;
/*
import cadenaderesponsabilidad.ManagerEmailHandler;
import cadenaderesponsabilidad.SalesEmailHandler;
import cadenaderesponsabilidad.SpamEmailHandler;
import cadenaderesponsabilidad.TechSupportEmailHandler;

import model.Email;
 */

public class EmailProcessorXCompany {

    //private final EmailHandler receiver1;

    public EmailProcessorXCompany(){
//        EmailHandler receiver1 = new TechSupportEmailHandler(
//                                    new ManagerEmailHandler(
//                                            new SalesEmailHandler(
//                                                    new SpamEmailHandler())));

        //this.receiver1 = new TechSupportEmailHandler();
        //EmailHandler receiver2 = new ManagerEmailHandler();
        //EmailHandler receiver3 = new SalesEmailHandler();
//        EmailHandler receiver4 = new SpamEmailHandler();

        //      receiver1.setSuccesor(receiver2);
        //receiver2.setSuccesor(receiver3);
        //receiver3.setSuccesor(receiver4);

    }

    public void procesarEmail(String subject, String toAddress){
        System.out.println(receiver1.handleEmail(new Email(subject, toAddress)));
    }
}
