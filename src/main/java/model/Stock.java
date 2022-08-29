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

    public Stock() {
        this.totalStockValue = 0;
        this.allProductsStock = new ArrayList<>();
    }

    public void addProduct(Product product) {
        String productClass = product.getClass().getSimpleName();
        this.allProductsStock.add(product);
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


    public Product getProductById(int id) {
        return this.allProductsStock.stream().filter(product -> product.getId() == id).findFirst().get();
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

    public void printTrees() {
        for (int i = 0; i < allProductsStock.size(); i++) {
            if (allProductsStock.get(i).getClass().equals(Tree.class)) {
                System.out.println(allProductsStock.get(i));
            }
        }

    }

    public Product findProduct(int productId) {

        boolean found = false;
        int i = 0;

        int size = allProductsStock.size();
        Product productFound = null;

        while (i < size && !found) {
            if (allProductsStock.get(i).getId() == productId) {

                productFound = allProductsStock.get(i);
                found = true;

            }
            i++;

        }
        return productFound;
    }

    public void showStockByCategory(String category) {
        this.allProductsStock.stream()
                .filter(product -> product.getClass().getSimpleName().equals(category))
                .forEach(System.out::println);
    }
}

