    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ticketbooking;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "ticket_booking")
public class Ticket {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int train_id;
    
    @Column(name = "journey_from")
    private String journeyFrom;
    
    @Column(name = "journey_to")
    private String journyTo;
    
    @Column(name = "date_and_time")
    private Date travellingDateTime;
    
    @Column(name = "no_of_tickets")
    private int no_of_ticket;

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }
    
    public String getJourneyFrom() {
        return journeyFrom;
    }

    public void setJourneyFrom(String journeyFrom) {
        this.journeyFrom = journeyFrom;
    }

    public String getJournyTo() {
        return journyTo;
    }

    public void setJournyTo(String journyTo) {
        this.journyTo = journyTo;
    }

    public Date getTravellingDateTime() {
        return travellingDateTime;
    }

    public void setTravellingDateTime(Date travellingDateTime) {
        this.travellingDateTime = travellingDateTime;
    }

    
    
    

    public int getNo_of_ticket() {
        return no_of_ticket;
    }

    public void setNo_of_ticket(int no_of_ticket) {
        this.no_of_ticket = no_of_ticket;
    }
    
    
    
}
