package wk;

import javax.jms.JMSException;

public class Main {
    public static void main(String[] args) throws JMSException {
        Consumer s = new Consumer();
        s.create("alfresco.events.allEvents");
    }
}