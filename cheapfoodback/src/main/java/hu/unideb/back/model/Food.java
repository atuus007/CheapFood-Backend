package hu.unideb.back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int mennyisegFajta;
    private int mennyiseg;

    public Food() {
    }

    public Food(String name, int mennyisegFajta, int mennyiseg) {
        this.name = name;
        this.mennyisegFajta = mennyisegFajta;
        this.mennyiseg = mennyiseg;
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
