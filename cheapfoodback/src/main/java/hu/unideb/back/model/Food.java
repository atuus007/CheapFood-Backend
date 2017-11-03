package hu.unideb.back.model;


public class Food {

    private Integer id;
    private String name;

    //private MeasureEnum mennyisegFajta;
    private Integer mennyisegFajta;
    private Integer mennyiseg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMennyisegFajta() {
        return mennyisegFajta;
    }


    public void setMennyisegFajta(Integer mennyisegFajta) {
        this.mennyisegFajta = mennyisegFajta;
    }

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



}
