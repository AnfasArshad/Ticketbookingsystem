/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trainbooking;

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
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    
    @GetMapping(path = "/passengers")
    public List<Passenger> getAllPassenger(){
        return passengerService.getPassenger();
    }
    
    @GetMapping(path = "/passengers/{passenger_id}")
    public Passenger getPassengerById(@PathVariable int passenger_id){
        return passengerService.findById(passenger_id);
    }
    
    @PostMapping(path = "/passengers")
    public Passenger createPassenger(@RequestBody Passenger passenger){
        return passengerService.createPassenger(passenger);
    }
    
    @PutMapping(path = "/passengers")
    public Passenger updatePassenger(@RequestBody Passenger updatePassenger){
        return passengerService.updatePassenger(updatePassenger);
    }
    
    @DeleteMapping(path = "/passengers/{id}")
    public void deleteById(@PathVariable int id){
        passengerService.deleteById(id);
    }
    
}
