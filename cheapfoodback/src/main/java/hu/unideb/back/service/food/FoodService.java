package hu.unideb.back.service.food;

import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.controller.food.converter.FoodResponse;
import hu.unideb.back.controller.food.converter.UpdateFoodRequest;
import hu.unideb.back.model.Food;


import java.util.List;

public interface FoodService {

    List<FoodResponse> getAllFoods();
    List<FoodResponse> getAllFoodsbeetween(Integer money1, Integer money2);
    void saveFood(CreateFoodRequest createFoodRequest);
    void saveFoodwithingsfood(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns, int osszar);
    boolean deleteFood(long id);
    boolean updateFood(UpdateFoodRequest updateFoodRequest);
    Integer findIngredientsIDByName(String Name);
    //Food insertFood(Food food);
    //Food getFoodById(Integer id);
}
