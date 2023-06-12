package com.derivedmethods.controller;

import com.derivedmethods.model.Laptop;
import com.derivedmethods.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    public LaptopService laptopService;

    @GetMapping("/getLaptops")
    public List<Laptop> getLaptops(){
        return laptopService.getLaptops();
    }

    @PostMapping("/addLaptop")
    public Laptop addLaptop(@RequestBody Laptop laptop){
        return laptopService.saveLaptop(laptop);
    }



}
