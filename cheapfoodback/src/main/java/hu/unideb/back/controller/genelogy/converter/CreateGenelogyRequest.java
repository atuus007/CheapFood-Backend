package hu.unideb.back.controller.genelogy.converter;

public class CreateGenelogyRequest {

    private int atlagar;
    private int mennyiseg;
    private String name;

    public CreateGenelogyRequest() {

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
