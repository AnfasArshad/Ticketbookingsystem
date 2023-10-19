/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.train_admin;

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
@Table(name = "train")
public class Train {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int train_id;
    
    @Column(name = "train_name")
    private String train_name;
    
    @Column(name = "journey_from")
    private String journey_from;
    
    @Column(name = "journey_to")
    private String journey_to;

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getJourney_from() {
        return journey_from;
    }

    public void setJourney_from(String journey_from) {
        this.journey_from = journey_from;
    }

    public String getJourney_to() {
        return journey_to;
    }

    public void setJourney_to(String journey_to) {
        this.journey_to = journey_to;
    }
    
    
    
    
    
}
