package model;

public class Email {
    private String subject;
    private String to;

    public Email(String subject, String toAddress) {
        this.subject = subject;
        this.to = toAddress;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
