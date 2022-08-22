package model;

import model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private double totalStockValue;
    private List<Product> allProductsStock;
    private List<Product> flowerStock;
    private List<Product> treeStock;
    private List<Product> decorationStock;

    public Stock() {
        this.totalStockValue = 0;
        this.allProductsStock = new ArrayList<>();
        this.flowerStock = new ArrayList<>();
        this.treeStock = new ArrayList<>();
        this.decorationStock = new ArrayList<>();
    }

    public void addProduct(Product product) {
        String productClass = product.getClass().getSimpleName();

        switch (productClass) {
            case "Tree":
                this.treeStock.add(product);
                this.allProductsStock.add(product);
                break;
            case "Flower":
                this.flowerStock.add(product);
                this.allProductsStock.add(product);
                break;
            case "Decoration":
                this.decorationStock.add(product);
                this.allProductsStock.add(product);
        }
        updateStockValue();
    }

    public void removeProduct(Product product) {
        this.allProductsStock.remove(product);
        updateStockValue();
    }

    public void updateStockValue(){
        this.allProductsStock.forEach(product -> {
            this.totalStockValue += product.getPrize();
        });
    }

    public double getTotalStockValue() {
        return totalStockValue;
    }
}
