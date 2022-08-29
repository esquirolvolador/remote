package controller;

import model.FlowerShop;

import model.Ticket;

import model.Stock;

import model.products.Decoration;
import model.products.Flower;
import model.products.Product;
import model.products.Tree;
import repository.Repository;
import view.Menu;

import java.util.List;
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
        Scanner scanner = new Scanner(System.in);
        Menu.printRemoveTreerMenu();
        this.flowerShop.showAllTrees();
        int productId = scanner.nextInt();
        this.flowerShop.removeProduct(this.flowerShop.findProduct(productId));
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
        Scanner scanner = new Scanner(System.in);
        Ticket newTicket = new Ticket();
        int option;
        Menu.printNewPurchaseTicketMenu();
        do {
            Menu.printAddProductsToPurchaseMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addProductToTicketAndRemoveFromStock(scanner, newTicket);
                    break;
                case 2:
                    addProductToTicketAndRemoveFromStock(scanner, newTicket);
                    break;
                case 3:
                    addProductToTicketAndRemoveFromStock(scanner, newTicket);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Por favor, introduce una opción válida");
            }

        } while (option != 0);
        this.flowerShop.addTicket(newTicket);
    }

    private void addProductToTicketAndRemoveFromStock(Scanner scanner, Ticket newTicket) {
        showStockByCategoryWithValues();
        //showStockByCategory();
        System.out.println("Por favor, introduce id");
        int id = scanner.nextInt();
        Product product = getProductById(id);
        newTicket.addProduct(product);
        this.flowerShop.removeProduct(product);
    }

    private Product getProductById(int id) {
        return this.flowerShop.getProductById(id);
    }

    public void showSalesHistory() {
        Menu.printSalesHistory(this.flowerShop.getSales());
    }

    public void showSalesTotalValue() {
        double value = 0;
        for (Ticket t : this.flowerShop.getSales()) {
            value += t.getTotalPrize();
        }
        Menu.printSalesTotalValue(value);

    }

    public FlowerShop getFlowerShop() {
        return flowerShop;
    }


}
