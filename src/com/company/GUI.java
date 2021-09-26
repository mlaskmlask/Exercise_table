package com.company;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class GUI {
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        showMainMenu();
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                Candy[] candyList = DataBase.getInstance().getCandy();
                for (Candy currentCandy : candyList) {
                    System.out.println(currentCandy);
                }
                mainMenu();
                break;
            case "2":
                CandyBar[] candyBarList = DataBase.getInstance().getCandyBar();
                for (CandyBar currentCandyBar : candyBarList) {
                    System.out.println(currentCandyBar);
                }
                mainMenu();
                break;
            case "3":
                Product[] productList = DataBase.getInstance().getAllProducts();
                for (Product currentProduct : productList) {
                    System.out.println(currentProduct);
                }
                mainMenu();
                break;
            case "4":
                System.out.println("Podaj nazwę produktu");
                String nameBuy = scanner.nextLine();
                System.out.println("Podaj ilość którą chcesz kupić");
                String quantityBuy = scanner.nextLine();
                boolean result = DataBase.getInstance().buyProduct(nameBuy, quantityBuy);
                if (result) {
                    System.out.println("Kupiono");
                } else {
                    System.out.println("Zakup się nie udał spróbuj jeszcze raz");
                }
                mainMenu();
                break;
            case "5":
                System.out.println("5");
                break;
            default:
                System.out.println("Nieprawidłowy wybór");
                mainMenu();
        }
    }

    private static void showMainMenu() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Lista cukierków");
        System.out.println("2. Lista batonów");
        System.out.println("3. Wszystkie");
        System.out.println("4. Kup");
        System.out.println("5. Wyjście");
    }
}
