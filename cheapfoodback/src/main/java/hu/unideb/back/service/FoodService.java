package hu.unideb.back.service;

import hu.unideb.back.model.Food;

import java.util.List;

public interface FoodService {

    List<Food> findAll();
    void sdf();
    //Food insertFood(Food food);
    //Food getFoodById(Integer id);
}
