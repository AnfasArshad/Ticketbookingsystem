/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trainbooking;

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
@Table(name = "passenger_details")
public class Passenger {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passenger_id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "id_number")
    private String id_number;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "contact_no")
    private int contact_no;
    
   

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

   
    
    
    
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContect_no(int contact_no) {
        this.contact_no = contact_no;
    }
        
}
