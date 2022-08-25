package model.products;

public class Flower extends Product {

    private int id;
    private String color;


    public Flower(double prize, String color) {
        super(prize);
        this.color = color;
        this.id = getCurrentId();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flor: Stock ID: " + this.id + ", color: " + this.color + ", precio: " + this.getPrize() + " €";
    }
}
