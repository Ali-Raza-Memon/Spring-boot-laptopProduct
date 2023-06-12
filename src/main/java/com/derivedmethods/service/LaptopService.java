package com.derivedmethods.service;

import com.derivedmethods.model.Laptop;
import com.derivedmethods.repository.LaptopRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Service
public class LaptopService {

    @Autowired
    public LaptopRepository laptopRepository;


    public Laptop saveLaptop(Laptop laptop){
        return laptopRepository.save(laptop);
    }

    public List<Laptop> getLaptops(){
        return laptopRepository.findAll();
    }


}
