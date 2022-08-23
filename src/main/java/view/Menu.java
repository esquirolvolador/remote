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
    }

