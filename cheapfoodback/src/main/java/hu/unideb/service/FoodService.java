package hu.unideb.service;

import hu.unideb.model.FoodModel;

import java.util.List;

public interface FoodService {
    List<FoodModel> findAll();
}
