/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.train_admin;

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
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping(path = "/trains")
    public List<Train> getAllTrain() {
        return trainService.getTrain();
    }

    @PostMapping(path = "/trains")
    public Train createTrain(@RequestBody Train train) {
        return trainService.createTrain(train);
    }

    @PutMapping(path = "/trains")
    public Train updateTrain(@RequestBody Train updateTrain) {
        return trainService.updateTrain(updateTrain);
    }
    
    @DeleteMapping(path = "/trains/{id}")
    public void deleteById(@PathVariable int id){
        trainService.deleteById(id);
    }
}
