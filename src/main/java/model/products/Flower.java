package model.products;

public class Flower extends Product {


    private String color;


    public Flower(double prize, String color) {
        super(prize);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int getId() {
        //return this.id;
        return super.getId();
    }

    @Override
    public String toString() {
        return "Flor: Stock ID: " + super.getId() + ", color: " + this.color + ", precio: " + this.getPrize() + " €";
    }
}
