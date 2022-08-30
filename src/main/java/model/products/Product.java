package model.products;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private double prize;
    protected static int currentId = 0;
    private int id;

    public Product(double prize) {
        this.prize = prize;
        currentId += 1;
        id = currentId;
    }

    public double getPrize() {
        return prize;
    }

    public int getCurrentId() {
        return currentId;
    }

    public int getId() {
        return id;
    }
}
