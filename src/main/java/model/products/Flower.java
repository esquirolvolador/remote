package model.products;

public class Flower extends Product {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Flower(double prize, String color) {
        super(prize);
        this.color = color;
    }
}
