package hu.unideb.repository;

import hu.unideb.model.Food;

import java.util.List;

public interface FoodRepository {
    List<Food> findAll();
}
