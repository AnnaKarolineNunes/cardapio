package com.example.cardapio.controller;


import com.example.cardapio.model.Food;
import com.example.cardapio.model.dtos.FoodDTO;
import com.example.cardapio.repositorie.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<FoodDTO> getAll(){
        List<FoodDTO> foodList = foodRepository.findAll().stream().map(FoodDTO::new).toList();
        return foodList;
    }
}
