package hu.unideb.repository;

import hu.unideb.model.FoodModel;

import java.util.List;

public interface FoodRepository {
    List<FoodModel> findAll();
}
