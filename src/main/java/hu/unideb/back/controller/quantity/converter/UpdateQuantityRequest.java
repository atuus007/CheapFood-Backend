package hu.unideb.back.controller.quantity.converter;

public class UpdateQuantityRequest {
    private long id;
    private String name;

    public UpdateQuantityRequest() {
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
