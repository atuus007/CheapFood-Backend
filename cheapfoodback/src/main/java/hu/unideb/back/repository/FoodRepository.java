package hu.unideb.back.repository;

import hu.unideb.back.model.Food;

import java.util.List;

public interface FoodRepository {
    List<Food> findAll();
    Food insertFood(Food food);
    Food getFoodById(Integer id);
}
