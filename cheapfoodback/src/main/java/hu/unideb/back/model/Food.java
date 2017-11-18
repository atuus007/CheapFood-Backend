package hu.unideb.back.model;

import javax.persistence.*;

@Entity
@Table(name = "etel")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int mennyisegfajta;
    private int mennyiseg;

    public Food() {
    }

    public Food(String name, int mennyisegfajta, int mennyiseg) {
        this.name = name;
        this.mennyisegfajta = mennyisegfajta;
        this.mennyiseg = mennyiseg;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMennyisegFajta() {
        return mennyisegfajta;
    }
    public void setMennyisegFajta(int mennyisegfajta) {
        this.mennyisegfajta = mennyisegfajta;
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
