package controller;

import model.FlowerShop;
import model.products.Decoration;
import model.products.Flower;
import model.products.Tree;
import repository.Repository;
import view.Menu;

import java.util.Scanner;

public class FlowerShopController {
    private FlowerShop flowerShop;
    private Repository repository;

    public FlowerShopController(Repository repository) {
        this.repository = repository;
    }

    public void createFlowerShop() {
        Scanner scanner = new Scanner(System.in);
        Menu.printCreateFlowerShopMenu();
        String name = scanner.nextLine();
        this.flowerShop = FlowerShop.getInstance(name);
        if (this.flowerShop != null) {
            Menu.printFlowerShopCreated();
        }
    }

    public void createFlowerShop(String name) {
        this.flowerShop = FlowerShop.getInstance(name);
        if (this.flowerShop != null) {
            Menu.printFlowerShopCreated();
        }
    }

    public void addTree() {
        Scanner scanner = new Scanner(System.in);
        Menu.printAddTreeMenu();
        double height = scanner.nextDouble();
        Menu.printEnterPrizePrompt();
        double prize = scanner.nextDouble();
        this.flowerShop.addProduct(new Tree(prize, height));
    }

    public void addFlower() {
        Scanner scanner = new Scanner(System.in);
        Menu.printAddFlowerMenu();
        String color = scanner.nextLine();
        Menu.printEnterPrizePrompt();
        double prize = scanner.nextDouble();
        this.flowerShop.addProduct(new Flower(prize, color));
    }

    public void addDecoration() {
        Scanner scanner = new Scanner(System.in);
        Decoration.Material decorationMaterial = null;
        Menu.printAddDecorationMenu();
        String material = scanner.nextLine().toLowerCase();
        switch (material) {
            case "plástico":
            case "plastico":
            case "plastic":
                decorationMaterial = Decoration.Material.PLASTIC;
                break;
            case "madera":
            case "wood":
                decorationMaterial = Decoration.Material.WOOD;
            default:
                System.out.println("Introduce un material válido (plástico/madera)");
        }
        Menu.printEnterPrizePrompt();
        double prize = scanner.nextDouble();
        this.flowerShop.addProduct(new Decoration(prize, decorationMaterial));
    }


    public void showAllProducts() {
        this.flowerShop.showAllProducts();
    }

    public void removeTree() {
    }

    public void removeFlower() {
    }

    public void removeDecoration() {
    }

    public void showStockByCategoryWithValues() {
        this.flowerShop.showAllProductsByStockWithValues();
    }

    public void showStockTotalValue() {
        Menu.printTotalStockValue(this.flowerShop.getStockValue());
    }

    public void newPurchaseTicket() {
    }

    public void showSalesHistory() {

    }

    public void showSalesTotalValue() {

    }

    public FlowerShop getFlowerShop() {
        return flowerShop;
    }


}
