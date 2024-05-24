package com.example.cardapio.model.dtos;

import com.example.cardapio.model.Food;

public record FoodDTO(Long id, String title, String image, Integer price) {
    public FoodDTO(Food food){
        this(food.getId(),food.getTitle(), food.getImage(), food.getPrice());
    }
}
