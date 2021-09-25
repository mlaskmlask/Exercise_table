package com.company;

import java.util.Scanner;

public class GUI {
    public void mainMenu() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Lista cukierków");
        System.out.println("2. Lista batonów");
        System.out.println("3. Wszystkie");
        System.out.println("4. Kup");
        System.out.println("5. Wyjście");

        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                DataBase db = new DataBase();
                Candy[] candyList = db.getCandy();
                for (Candy currentCandy : candyList) {
                    System.out.println(currentCandy);
                }
                mainMenu();
                break;
            case "2":
                DataBase db1 = new DataBase();
                CandyBar[] candyBarList = db1.getCandyBar();
                for (CandyBar currentCandyBar : candyBarList){
                    System.out.println(currentCandyBar);
                }
                mainMenu();
                break;
            case "3":
                DataBase db2 = new DataBase();
                Product[] productList = db2.getAllProducts();
                for (Product currentProduct: productList){
                    System.out.println(currentProduct);
                }
                mainMenu();
                break;
            case "4":
                DataBase db3 = new DataBase();
                db3.buyProduct();
                break;
            case "5":
                System.out.println("5");
                break;
            default:
                System.out.println("Nieprawidłowy wybór");
        }
    }
}
