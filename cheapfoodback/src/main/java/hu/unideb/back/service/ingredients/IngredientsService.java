package hu.unideb.back.service.ingredients;

import hu.unideb.back.controller.food.converter.FoodResponse;
import hu.unideb.back.controller.ingredients.converter.CreateIngredientsRequest;
import hu.unideb.back.controller.ingredients.converter.IngredientsResponse;
import hu.unideb.back.controller.ingredients.converter.UpdateIngredientsRequest;
import hu.unideb.back.model.Ingredients;
import java.util.List;

public interface IngredientsService {

    List<IngredientsResponse> findAllIngredients();
    List<IngredientsResponse> findIngredientsById(Long Id);
    void saveIngredients(CreateIngredientsRequest createIngredientsRequest);
    boolean deleteIngredients(long id);
    boolean updateIngredients(UpdateIngredientsRequest updateIngredientsRequest);

}
