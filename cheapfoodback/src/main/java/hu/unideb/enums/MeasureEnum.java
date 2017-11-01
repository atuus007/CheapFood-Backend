package hu.unideb.enums;


public enum MeasureEnum {
    KiloGram(1),
    DekaGram(2),
    Gramm(3),
    MiliGram(4),
    Liter(5);

    private final int id;
    private MeasureEnum(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
