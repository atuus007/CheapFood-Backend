package hu.unideb.back.controller.ingredients.converter;

public class IngredientsResponse {

    private long id;
    private int atlagar;
    private int mennyiseg;
    private String name;

    public IngredientsResponse(){

    }
    public int getMennyiseg() {
        return mennyiseg;
    }
    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    public long getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
