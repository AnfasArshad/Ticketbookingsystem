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
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(path = "/admins")
    public List<Admin> getAllAdmin() {
        return adminService.getAdmin();
    }

    @GetMapping(path = "/admins/{admin_id}")
    public Admin getPassengerById(@PathVariable int passenger_id) {
        return adminService.findById(passenger_id);
    }

    @PostMapping(path = "/admins")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }

    @PutMapping(path = "/admins")
    public Admin updateAdmin(@RequestBody Admin updateAdmin) {
        return adminService.updateAdmin(updateAdmin);
    }

    @DeleteMapping(path = "/admins/{id}")
    public void deleteById(@PathVariable int id) {
        adminService.deleteById(id);
    }

}
