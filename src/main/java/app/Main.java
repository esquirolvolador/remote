package app;

import view.Menu;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;

        do {
            switch (Menu.printMainMenu()) {
                case 1:
                    createFlowerShop();
                    break;
                case 2:
                    addTree();
                    break;
                case 3:
                    addFlower();
                    break;
                case 4:
                    addDecoration();
                    break;
                case 5:
                    showAllProducts();
                    break;
                case 6:
                    removeTree();
                    break;
                case 7:
                    removeFlower();
                    break;
                case 8:
                    removeDecoration();
                    break;
                case 9:
                    showStockByCategory();
                    break;
                case 10:
                    showStockTotalValue();
                    break;
                case 11:
                    newPurchaseTicket();
                    break;
                case 12:
                    showSalesHistory();
                    break;
                case 13:
                    showSalesTotalValue();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación");
                    exit = true;
                    break;
            }
        } while (!exit);

    }

    public static void createFlowerShop() {}
    public static void addTree() {}
    public static void addFlower() {}
    public static void addDecoration() {}
    public static void showAllProducts() {}
    public static void removeTree() {}
    public static void removeFlower() {}
    public static void removeDecoration() {}
    public static void showStockByCategory() {}
    public static void showStockTotalValue() {}
    public static void newPurchaseTicket() {}
    public static void showSalesHistory() {}
    public static void showSalesTotalValue() {}


    }

