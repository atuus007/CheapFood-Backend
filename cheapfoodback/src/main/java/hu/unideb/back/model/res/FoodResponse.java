package hu.unideb.back.model.res;

public class FoodResponse {

    private long id;
    private String name;
    private int mennyisegFajta;
    private int mennyiseg;

    public FoodResponse() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMennyisegFajta() {
        return mennyisegFajta;
    }
    public void setMennyisegFajta(int mennyisegFajta) {
        this.mennyisegFajta = mennyisegFajta;
    }
    public int getMennyiseg() { return mennyiseg; }
    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    public long getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
