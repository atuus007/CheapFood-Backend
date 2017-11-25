package hu.unideb.back.service.food;

import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.controller.food.converter.FoodResponse;
import hu.unideb.back.controller.food.converter.UpdateFoodRequest;


import java.util.List;

public interface FoodService {

    List<FoodResponse> getAllFoods();
    void saveFood(CreateFoodRequest createFoodRequest);
    boolean deleteFood(long id);
    boolean updateFood(UpdateFoodRequest updateFoodRequest);
    //Food insertFood(Food food);
    //Food getFoodById(Integer id);
}
