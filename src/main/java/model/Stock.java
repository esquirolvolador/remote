package model;

import model.products.Decoration;
import model.products.Flower;
import model.products.Product;
import model.products.Tree;
import view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private double totalStockValue;
    private List<Product> allProductsStock;
/*    private List<Product> flowerStock;
    private List<Product> treeStock;
    private List<Product> decorationStock;*/

    public Stock() {
        this.totalStockValue = 0;
        this.allProductsStock = new ArrayList<>();
/*        this.flowerStock = new ArrayList<>();
        this.treeStock = new ArrayList<>();
        this.decorationStock = new ArrayList<>();*/
    }

    public void addProduct(Product product) {
        String productClass = product.getClass().getSimpleName();
        this.allProductsStock.add(product);
        /*switch (productClass) {
            case "Tree":
                //this.treeStock.add(product);
                this.allProductsStock.add(product);
                break;
            case "Flower":
                //this.flowerStock.add(product);
                this.allProductsStock.add(product);
                break;
            case "Decoration":
                //this.decorationStock.add(product);
                this.allProductsStock.add(product);
        }*/
        updateStockValue();
    }

    public void removeProduct(Product product) {
        this.allProductsStock.remove(product);
        updateStockValue();
    }

    public void updateStockValue() {
        this.totalStockValue = 0;
        this.allProductsStock.forEach(product -> {
            this.totalStockValue += product.getPrize();
        });
    }

    public double getTotalStockValue() {
        return totalStockValue;
    }

    public void printAllProducts() {
        this.allProductsStock.forEach(System.out::println);
    }

    public void printAllProductsByStockWithValues() {

        printProductsByStockWithValues("Flower");

        printProductsByStockWithValues("Tree");

        printProductsByStockWithValues("Decoration");

    }

    private void printProductsByStockWithValues(String productClass) {
        double value = 0;

        Menu.printShowProductStock(productClass);
        for (Product x : this.allProductsStock) {

            if (x.getClass().getSimpleName().equals(productClass)) {
                System.out.println(x);
                value += x.getPrize();
            }
        }
        Menu.printTotalPriceByStock(value);
    }

    public List<Product> getAllProductsStock() {
        return allProductsStock;
    }
}

