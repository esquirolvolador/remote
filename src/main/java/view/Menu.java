package view;

import model.Ticket;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static byte printMainMenu() {

        Scanner sc = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 14;

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
            System.out.println("14 -  Cargar floristería");
            System.out.println(" 0 -  Guardar y salir");

            option = sc.nextByte();
            if (option < MIN || option > MAX) {
                System.out.println("Escoge una opción válida");
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

    public static void printEnterPrizePrompt() {
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

    public static void printNewPurchaseTicketMenu() {
        System.out.println("*********   Nueva compra   *********");
    }

    public static void printAddProductsToPurchaseMenu() {
        System.out.println("1 - Añadir árbol");
        System.out.println("2 - Añadir flor");
        System.out.println("3 - Añadir decoración");
        System.out.println("0 - Finalizar ticket");
        System.out.println("Introduce una opción:");
    }

    public static void printTotalStockValue(double stockValue) {
        System.out.println("*********   El valor total del Stock en la tienda es: " + stockValue + "  *********");
    }

    public static void printTotalPriceByStock(double value) {
        System.out.println("*********   El valor del Stock es: " + value + "  *********");
    }

    public static void printShowProductStock(String productClass) {
        System.out.println("*********   Stock de " + productClass + " en tienda  *********");
    }

    public static void printRemoveTreerMenu() {
        System.out.println("*********   Eliminar árbol   *********");
        System.out.println("Introduce el número de id correspondiente a eliminar:");
    }

    public static void printRemoveFlowerMenu() {
        System.out.println("*********   Eliminar flor   *********");
        System.out.println("Introduce el número de id correspondiente a eliminar:");
    }

    public static void printRemoveDecorationMenu() {
        System.out.println("*********   Eliminar decoración   *********");
        System.out.println("Introduce el número de id correspondiente a eliminar:");
    }

    public static void printAvaliableFlowersPhrase() {
        System.out.println("*********   Flores disponibles   *********");
    }public static void printAvaliableTreesPhrase() {
        System.out.println("*********   Árboles disponibles   *********");
    }public static void printAvaliableDecorationsPhrase() {
        System.out.println("*********   Decoraciones disponibles   *********");
    }

    public static void printEnterIdPrompt() {
        System.out.println("Introduce el ID del producto:");
    }

    public static void printProductAddedCorrectly() {
        System.out.println("Producto añadido correctamente.");
    }

    public static void printTicketCreatedCorrectly() {
        System.out.println("Se ha creado un nuevo ticket.");
    }

    public static void printSalesHistory(List<Ticket> sales) {
        sales.forEach(System.out::println);
    }

    public static void printSalesTotalValue(Double value) {
        System.out.println("*********   El valor total de las ventas ha sido " + value + "  *********");

    }
}

