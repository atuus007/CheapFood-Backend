package hu.unideb.back.controller.ingredients.converter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CreateIngredientsRequest {

    private int atlagar;
    private int mennyiseg;
    private String name;

    public CreateIngredientsRequest(){

    }
    public int getMennyiseg() {
        return mennyiseg;
    }
    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    public int getAtlagar() {
        return atlagar;
    }
    public void setAtlagar(Integer atlagar) {
        this.atlagar = atlagar;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
