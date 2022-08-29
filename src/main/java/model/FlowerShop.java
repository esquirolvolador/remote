package model;

import model.products.Flower;
import model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private static FlowerShop instance;
    private String name;
    private Stock stock;
    private List<Ticket> sales;

    private FlowerShop(String name) {
        this.name = name;
        this.stock = new Stock();
        this.sales = new ArrayList<>();
    }

    public static FlowerShop getInstance(String name) {
        if (instance == null) {
            instance = new FlowerShop(name);
        }
        return instance;
    }

    public void addProduct(Product product) {
        this.stock.addProduct(product);
    }

    public void removeProduct(Product product) {
        this.stock.removeProduct(product);
    }

    public double getStockValue() {
        return this.stock.getTotalStockValue();
    }

    public void showAllProducts() {
        this.stock.printAllProducts();
    }

    public Product getProductById(int id) {
        return this.stock.getProductById(id);
    }

    public void addTicket(Ticket newTicket) {
        this.sales.add(newTicket);
    }

    public void showAllProductsByStockWithValues() {
        this.stock.printAllProductsByStockWithValues();
    }

    public Stock getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public void showAllTrees() {
        this.stock.printTrees();
    }

    public Product findProduct(int productId) {
        return this.stock.findProduct(productId);

    }

    public List<Ticket> getSales() {
        return sales;
    }

    public void setSales(List<Ticket> sales) {
        this.sales = sales;
    }
}
