package hu.unideb.back.service;

import hu.unideb.back.controller.converter.CreateFoodRequest;
import hu.unideb.back.controller.converter.FoodResponse;
import hu.unideb.back.controller.converter.UpdateFoodRequest;


import java.util.List;

public interface FoodService {

    List<FoodResponse> getAllFoods();
    void saveFood(CreateFoodRequest createFoodRequest);
    boolean deleteFood(long id);
    boolean updateFood(UpdateFoodRequest updateFoodRequest);
    //Food insertFood(Food food);
    //Food getFoodById(Integer id);
}
