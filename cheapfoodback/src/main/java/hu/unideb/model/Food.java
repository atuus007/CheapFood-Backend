package hu.unideb.model;

import hu.unideb.enums.MeasureEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


public class Food {

    private Integer id;
    private String name;
    private Date date;
    private MeasureEnum mennyisegFajta;
    private Integer mennyiseg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MeasureEnum getMennyisegFajta() {
        return mennyisegFajta;
    }


    public void setMennyisegFajta(Integer mennyisegFajta) {
        this.mennyisegFajta = MeasureEnum.values()[mennyisegFajta];
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
