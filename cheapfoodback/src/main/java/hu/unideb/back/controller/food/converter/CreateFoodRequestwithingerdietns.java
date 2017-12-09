package hu.unideb.back.controller.food.converter;

import hu.unideb.back.model.IngredientswithGenelogy;

import java.util.List;

public class CreateFoodRequestwithingerdietns {
    private String name;
    private int mennyisegfajta;
    private int mennyiseg;
    private int elkeszitesi_ido;
    private List<IngredientswithGenelogy> ingredientsList;

    public CreateFoodRequestwithingerdietns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMennyisegfajta() {
        return mennyisegfajta;
    }

    public void setMennyisegfajta(int mennyisegfajta) {
        this.mennyisegfajta = mennyisegfajta;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getElkeszitesi_ido() {
        return elkeszitesi_ido;
    }

    public void setElkeszitesi_ido(int elkeszitesi_ido) {
        this.elkeszitesi_ido = elkeszitesi_ido;
    }

    public List<IngredientswithGenelogy> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<IngredientswithGenelogy> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }
}
