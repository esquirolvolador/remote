package model;

import model.products.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int currentId = 0;
    private final int id;
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
        this.totalPrize = 0;
        this.products.forEach(product -> totalPrize += product.getPrize());
    }

    public double getTotalPrize() {
        return this.totalPrize;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("**************************************************\n");
        stringBuilder.append("Ticket nº ").append(id);
        stringBuilder.append("\n--------------------------------------------------\n");
        this.products.forEach(product -> stringBuilder.append(product).append("\n"));
        stringBuilder.append("Total: ").append(totalPrize).append("€");
        stringBuilder.append("\n**************************************************");

        return stringBuilder.toString();
    }
}
