package hu.unideb.back.model;

public class IngredientswithGenelogy {

    private String name;
    private int mennyisegfajta;
    private int mennyiseg;
    private int atlagar;

    public IngredientswithGenelogy() {
    }

    public IngredientswithGenelogy(String name, int mennyisegfajta, int mennyiseg, int atlagar) {
        this.name = name;
        this.mennyisegfajta = mennyisegfajta;
        this.mennyiseg = mennyiseg;
        this.atlagar = atlagar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getMennyisegfajta() {
        return mennyisegfajta;
    }

    public void setMennyisegfajta(int mennyisegfajta) {
        this.mennyisegfajta = mennyisegfajta;
    }

    public int getAtlagar() {
        return atlagar;
    }

    public void setAtlagar(int atlagar) {
        this.atlagar = atlagar;
    }
}
