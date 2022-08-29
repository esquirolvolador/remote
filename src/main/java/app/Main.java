package app;

import controller.FlowerShopController;
import model.Ticket;
import model.products.Decoration;
import model.products.Flower;
import model.products.Tree;
import repository.Repository;
import repository.TextFileRepository;
import view.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        Repository repository = new TextFileRepository();
        FlowerShopController flowerShopController = new FlowerShopController(repository);

        //Popular datos
        flowerShopController.createFlowerShop("Floristeria");

        for (int i = 0; i < 5; i++) {
            Decoration dec = new Decoration(1, Decoration.Material.PLASTIC);
            Flower flo = new Flower(1, "blue");
            Tree tree = new Tree(1, 100);
            flowerShopController.getFlowerShop().addProduct(tree);
            flowerShopController.getFlowerShop().addProduct(flo);
            flowerShopController.getFlowerShop().addProduct(dec);
            Ticket t = new Ticket();
            List<Ticket> sales = new ArrayList<>();
            t.addProduct(dec);
            t.addProduct(flo);
            t.addProduct(tree);
            sales.add(t);
            flowerShopController.getFlowerShop().addTicket(t);
        }


        do {
            switch (Menu.printMainMenu()) {
                case 1:
                    flowerShopController.createFlowerShop();
                    break;
                case 2:
                    flowerShopController.addTree();
                    break;
                case 3:
                    flowerShopController.addFlower();
                    break;
                case 4:
                    flowerShopController.addDecoration();
                    break;
                case 5:
                    flowerShopController.showAllProducts();
                    break;
                case 6:
                    flowerShopController.removeTree();
                    break;
                case 7:
                    flowerShopController.removeFlower();
                    break;
                case 8:
                    flowerShopController.removeDecoration();
                    break;
                case 9:
                    flowerShopController.showStockByCategoryWithValues();
                    break;
                case 10:
                    flowerShopController.showStockTotalValue();
                    break;
                case 11:
                    flowerShopController.newPurchaseTicket();
                    break;
                case 12:
                    flowerShopController.showSalesHistory();
                    break;
                case 13:
                    flowerShopController.showSalesTotalValue();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación");
                    exit = true;
                    break;
            }
        } while (!exit);

    }

}

