package hu.unideb.back.controller.food.converter;

import hu.unideb.back.model.Genelogy;
import hu.unideb.back.model.Ingredients;
import java.util.List;

public class CreateFoodRequestwithingerdietns {
    private String name;
    private List<Ingredients> ingredientsList;
    private List<Integer> genelogyList;

    public CreateFoodRequestwithingerdietns() {
    }

    public List<Integer> getGenelogyList() {
        return genelogyList;
    }

    public void setGenelogyList(List<Integer> genelogyList) {
        this.genelogyList = genelogyList;
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
