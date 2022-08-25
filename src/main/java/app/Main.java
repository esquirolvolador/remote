package app;

import controller.FlowerShopController;
import repository.Repository;
import repository.TextFileRepository;
import view.Menu;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        Repository repository = new TextFileRepository();
        FlowerShopController flowerShopController = new FlowerShopController(repository);

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
                    flowerShopController.showStockByCategory();
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

