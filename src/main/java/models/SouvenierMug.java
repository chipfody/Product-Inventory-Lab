package models;

public class SouvenierMug {
    private int id;
    private int quantity;
    private String state;
    private int sizeOz;
    private float price;

    public SouvenierMug(int id, int quantity, String state, int sizeOz, float price) {
        this.id = id;
        this.quantity = quantity;
        this.state = state;
        this.sizeOz = sizeOz;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSizeOz() {
        return sizeOz;
    }

    public void setSizeOz(int sizeOz) {
        this.sizeOz = sizeOz;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
