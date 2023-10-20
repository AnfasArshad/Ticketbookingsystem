/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ticketbooking;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenovo
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class TicketController {

    @Autowired
    private TicketService ticketService;
    
    @GetMapping(path = "/bookedtickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getTicket();
    }
    
    @PostMapping(path = "/bookedtickets")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicketBooking(ticket);
    }    
    
    @PutMapping(path = "/bookedtickets")
    public Ticket updateTicket(@RequestBody Ticket updateTicket) {
        return ticketService.updateTicket(updateTicket);
    }
    
    
    @DeleteMapping(path = "/bookedtickets/{id}")
    public void deleteById(@PathVariable int id){
        ticketService.deleteById(id);
    }
    
}
