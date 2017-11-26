package hu.unideb.back.model;

public class Querys {

    private long et_id;
    private String hozzavalok_name;
    private long szorzo;
    private String mennyisegek_name;

    public Querys(long et_id, String hozzavalok_name, long szorzo, String mennyisegek_name) {
        this.et_id = et_id;
        this.hozzavalok_name = hozzavalok_name;
        this.szorzo = szorzo;
        this.mennyisegek_name = mennyisegek_name;
    }

    public long getEt_id() {
        return et_id;
    }

    public void setEt_id(long et_id) {
        this.et_id = et_id;
    }

    public String getHozzavalok_name() {
        return hozzavalok_name;
    }

    public void setHozzavalok_name(String hozzavalok_name) {
        this.hozzavalok_name = hozzavalok_name;
    }

    public long getSzorzo() {
        return szorzo;
    }

    public void setSzorzo(long szorzo) {
        this.szorzo = szorzo;
    }

    public String getMennyisegek_name() {
        return mennyisegek_name;
    }

    public void setMennyisegek_name(String mennyisegek_name) {
        this.mennyisegek_name = mennyisegek_name;
    }
}
