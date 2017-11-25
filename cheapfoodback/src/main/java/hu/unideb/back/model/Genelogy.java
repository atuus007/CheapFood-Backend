package hu.unideb.back.model;

import javax.persistence.*;

@Table(name = "genelogy")
@Entity
public class Genelogy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long parentid;
    private long gyerekid;
    private long szorzo;


    public Genelogy(){

    }

    public long   getParentid() { return parentid; }
    public long   getGyerekid() { return gyerekid; }
    public void   setId(long id) { this.id = id; }
    public void   setParentid(long parentid) { this.parentid = parentid; }
    public void   setGyerekid(long gyerekid) { this.gyerekid = gyerekid; }
    public long   getId() {
        return id;
    }
    public void   setId(Integer id) {
        this.id = id;
    }
    public long getSzorzo() { return szorzo; }
    public void setSzorzo(long szorzo) { this.szorzo = szorzo; }
}
