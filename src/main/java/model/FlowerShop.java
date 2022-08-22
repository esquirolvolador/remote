package model;

import model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private String name;
    private Stock stock;

    public FlowerShop(String name) {
        this.name = name;
        this.stock = new Stock();
    }

    public void addProduct(Product product) {
        this.stock.addProduct(product);
    }

    public void removeProduct(Product product) {
        this.stock.removeProduct(product);
    }

    public double getStockValue(){
        return this.stock.getTotalStockValue();
    }

}
