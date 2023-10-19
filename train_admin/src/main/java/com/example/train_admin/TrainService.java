/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.train_admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;
    
    public List<Train>getTrain(){
        return trainRepository.findAll();
    }
 
        public Train createTrain(Train train){
            return trainRepository.save(train);
        }
        
        public Train updateTrain(Train train){
            return trainRepository.save(train);
        }
        
        public Train deleteById(int id){
        trainRepository.deleteById(id);
        return null;
        }
        
}
