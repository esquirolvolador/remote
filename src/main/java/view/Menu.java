package view;

import java.util.Scanner;

public class Menu {
    public static byte printMainMenu() {

        Scanner sc = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 13;

        do {
            System.out.println("**************************************************");
            System.out.println("*                 Menú principal                 *");
            System.out.println("**************************************************");
            System.out.println();
            System.out.println("1  -  Crear floristería");
            System.out.println("2  -  Añadir árbol");
            System.out.println("3  -  Añadir flor");
            System.out.println("4  -  Añadir decoración");
            System.out.println("5  -  Mostrar todos los productos disponibles");
            System.out.println("6  -  Retirar árbol");
            System.out.println("7  -  Retirar flor");
            System.out.println("8  -  Retirar decoración");
            System.out.println("9  -  Mostrar el stock por categoría");
            System.out.println("10 -  Mostrar el valor total del stock");
            System.out.println("11 -  Nuevo ticket de compra");
            System.out.println("12 -  Mostrar el histórico de ventas");
            System.out.println("13 -  Mostrar el valor total de las ventas");
            System.out.println(" 0 -  Salir");

            option = sc.nextByte();
            if (option < MIN || option > MAX) {
                System.out.println("Escoje una opción válida");
            }
        } while (option < MIN || option > MAX);
        return option;

    }

    public static void printCreateFlowerShopMenu() {
        System.out.println("*********   Nueva floristería   *********");
        System.out.println("Introduce el nombre de la floristería:");
    }

    public static void printFlowerShopCreated() {
        System.out.println("Floristería creada con éxito.");
    }

    public static void printAddTreeMenu() {
        System.out.println("*********   Añadir árbol   *********");
        System.out.println("Introduce la altura del árbol:");
    }


    public static void printEnterPrizePrompt(){
        System.out.println("Introduce el precio:");
    }

    public static void printAddFlowerMenu() {
        System.out.println("*********   Añadir flor   *********");
        System.out.println("Introduce el color de la flor:");
    }

    public static void printAddDecorationMenu() {
        System.out.println("*********   Añadir decoración   *********");
        System.out.println("Introduce el material de la decoración (plástico/madera):");
    }



    public static void printTotalStockValue(double stockValue) {
        System.out.println("*********   El valor total del Stock en la tienda es: " + stockValue + "  *********");
    }

    public static void printTotalPriceByStock(double value) {
        System.out.println("*********   El valor del Stock es: " + value + "  *********");
    }

    public static void printShowProductStock(String productClass) {
        System.out.println("*********   Stock de " + productClass + " en tienda  *********");

    public static void printRemoveTreerMenu() {
        System.out.println("*********   Eliminar árbol   *********");
        System.out.println("Introduce el id correspondiente:");
    }
    public static void printRemoveFlowerMenu() {
        System.out.println("*********   Eliminar flor   *********");
        System.out.println("Introduce el color de la flor:");
    }

    public static void printRemoveDecorationMenu() {
        System.out.println("*********   Eliminar decoración   *********");
        System.out.println("Introduce el material de la decoración (plástico/madera):");

    }
}

