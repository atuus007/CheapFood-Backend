package hu.unideb.back.model;

import javax.persistence.*;

@Table(name = "mennyisegek")
@Entity
public class Quantity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Quantity(){

    }
    public long getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
