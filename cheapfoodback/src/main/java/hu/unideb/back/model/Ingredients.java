package hu.unideb.back.model;

public class Ingredients {
    private Integer id;
    private Integer atlagar;
    private Integer mennyiseg;
    private String name;

    public Integer getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAtlagar() {
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
