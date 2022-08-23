package model.products;

public class Flower extends Product {
    private String color;

    public Flower(double prize, String color) {
        super(prize);
        this.color = color;
    }
}
