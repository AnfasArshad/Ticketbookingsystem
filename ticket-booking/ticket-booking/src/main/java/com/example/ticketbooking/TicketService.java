/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ticketbooking;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    
    public List<Ticket>getTicket(){
        return ticketRepository.findAll();
    }
    
    public Ticket createTicketBooking(Ticket ticket){
        return ticketRepository.save(ticket);
    }
    
    
      public Ticket updateTicket(Ticket ticket){
            return ticketRepository.save(ticket);
        }
      
      public Ticket deleteById(int id){
        ticketRepository.deleteById(id);
        return null;
        }
}
