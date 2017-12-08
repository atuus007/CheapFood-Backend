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
    private int elkeszitesi_ido;
    private int osszar;

    public Food() {
    }

    public Food(String name, int mennyisegfajta, int mennyiseg) {
        this.name = name;
        this.mennyisegfajta = mennyisegfajta;
        this.mennyiseg = mennyiseg;
    }

    public Food(String name, int mennyisegfajta, int mennyiseg, int elkeszitesi_ido) {
        this.name = name;
        this.mennyisegfajta = mennyisegfajta;
        this.mennyiseg = mennyiseg;
        this.elkeszitesi_ido = elkeszitesi_ido;
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

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMennyisegfajta() {
        return mennyisegfajta;
    }

    public void setMennyisegfajta(int mennyisegfajta) {
        this.mennyisegfajta = mennyisegfajta;
    }

    public int getElkeszitesi_ido() {
        return elkeszitesi_ido;
    }

    public void setElkeszitesi_ido(int elkeszitesi_ido) {
        this.elkeszitesi_ido = elkeszitesi_ido;
    }

    public int getOsszar() {
        return osszar;
    }

    public void setOsszar(int osszar) {
        this.osszar = osszar;
    }
}
