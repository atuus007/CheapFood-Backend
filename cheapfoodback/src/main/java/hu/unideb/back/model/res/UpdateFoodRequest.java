package hu.unideb.back.model.res;

public class UpdateFoodRequest {


    private String name;
    private int mennyisegFajta;
    private int mennyiseg;

    public UpdateFoodRequest() {
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

}
