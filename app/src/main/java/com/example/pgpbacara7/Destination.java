package com.example.pgpbacara7;
import java.security.PublicKey;
public class Destination {
    private String destinationName;

    public Destination(String destinationName, String ticketClass) {
        this.destinationName = destinationName;
        this.ticketClass = ticketClass;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName){
        this.destinationName = destinationName;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    private String ticketClass;


}
