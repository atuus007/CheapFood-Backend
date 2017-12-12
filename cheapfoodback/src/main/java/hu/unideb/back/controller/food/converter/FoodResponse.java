package hu.unideb.back.controller.food.converter;

public class FoodResponse {
    private long id;
    private String name;
    private int mennyisegfajta;
    private int mennyiseg;
    private int elkeszitesi_ido;
    private int osszar;

    public FoodResponse() {
    }

    public FoodResponse(long id, String name, int mennyisegfajta, int mennyiseg, int elkeszitesi_ido, int osszar) {
        this.id = id;
        this.name = name;
        this.mennyisegfajta = mennyisegfajta;
        this.mennyiseg = mennyiseg;
        this.elkeszitesi_ido = elkeszitesi_ido;
        this.osszar = osszar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMennyisegfajta() {
        return mennyisegfajta;
    }

    public void setMennyisegfajta(int mennyisegfajta) {
        this.mennyisegfajta = mennyisegfajta;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getOsszar() {
        return osszar;
    }

    public void setOsszar(int osszar) {
        this.osszar = osszar;
    }

    public int getElkeszitesi_ido() {
        return elkeszitesi_ido;
    }

    public void setElkeszitesi_ido(int elkeszitesi_ido) {
        this.elkeszitesi_ido = elkeszitesi_ido;
    }
}
