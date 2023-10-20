/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trainbooking;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getPassenger() {
        return passengerRepository.findAll();
    }

    public Passenger findById(int id) {
        Optional<Passenger> passenger = passengerRepository.findById(id);
        if (passenger.isPresent()) {
            return passenger.get();
        } else {
            return null;
        }
    }
    
    public Passenger createPassenger(Passenger passenger){
        return passengerRepository.save(passenger);
    }
    
    public Passenger updatePassenger(Passenger passenger){
        return passengerRepository.save(passenger);
    }
    
    public Passenger deleteById(int id){
        passengerRepository.deleteById(id);
        return null;
    }

}
