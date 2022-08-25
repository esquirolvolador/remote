package model.products;

public abstract class Product {
    private double prize;
    protected static int currentId =0;

    public Product(double prize) {
        this.prize = prize;
        currentId += 1;
    }

    public double getPrize() {
        return prize;
    }

    public int getCurrentId(){
        return currentId;
    }
}
