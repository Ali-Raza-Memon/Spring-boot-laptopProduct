package com.derivedmethods.service;

import com.derivedmethods.repository.LaptopRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Service
public class LaptopService {
    public LaptopRepository laptopRepository;




}
