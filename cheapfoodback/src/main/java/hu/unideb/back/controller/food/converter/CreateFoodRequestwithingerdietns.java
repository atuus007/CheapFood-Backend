package hu.unideb.back.controller.food.converter;

import hu.unideb.back.model.Ingredients;
import java.util.List;

public class CreateFoodRequestwithingerdietns {
    private String name;
    private List<Ingredients> ingredientsList;

    public CreateFoodRequestwithingerdietns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }
}
