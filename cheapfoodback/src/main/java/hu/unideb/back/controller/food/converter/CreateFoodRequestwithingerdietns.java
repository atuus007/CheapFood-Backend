package hu.unideb.back.controller.food.converter;

import hu.unideb.back.model.IngredientswithGenelogy;

import java.util.List;

public class CreateFoodRequestwithingerdietns {
    private String name;
    private List<IngredientswithGenelogy> ingredientsList;

    public CreateFoodRequestwithingerdietns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientswithGenelogy> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<IngredientswithGenelogy> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }
}
