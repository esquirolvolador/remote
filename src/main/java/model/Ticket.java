package model;

import model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private static int currentId = 0;
    private int id;
    private List<Product> products;
    private double totalPrize;

    public Ticket() {
        currentId += 1;
        this.id = currentId;
        this.totalPrize = 0;
        this.products = new ArrayList<>();
    }

    public Ticket(List<Product> products) {
        currentId += 1;
        this.id = currentId;
        this.totalPrize = 0;
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        updateTotalPrize();
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        updateTotalPrize();
    }

    private void updateTotalPrize() {
        this.products.forEach(product -> totalPrize += product.getPrize());
    }

    public double getTotalPrize() {
        return this.totalPrize;
    }

    @Override
    public String toString() {
        return "Ticket nº " + id +
                "\n*********************\n" + products +
                "\nTotal:" + totalPrize + "€";
    }
}
