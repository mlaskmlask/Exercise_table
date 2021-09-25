package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DataBase {
    Product[] products = new Product[5];

    public DataBase() {
        Candy p1 = new Candy(1.20, "Trufla", "truflowy", 10, "okrągły", "brązowy");
        Candy p2 = new Candy(1.30, "Truskawka", "truskawkowy", 20, "owalny", "czerwony");
        Candy p3 = new Candy(1.50, "Arbuz", "arbuzowy", 25, "kwadratowy", "różowy");
        CandyBar p4 = new CandyBar(2.40, "Neptun", "czekoladowy", 10, 120.50);
        CandyBar p5 = new CandyBar(2.20, "Jowisz", "toffie", 30, 100.45);

        this.products[0] = p1;
        this.products[1] = p2;
        this.products[2] = p3;
        this.products[3] = p4;
        this.products[4] = p5;
    }

    public Candy[] getCandy() {
        int productCounter = 0;
        for (Product currentProduct : this.products) {
            if (currentProduct instanceof Candy) {
                productCounter++;
            }
        }
        Candy[] candyList = new Candy[productCounter];
        int counter = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof Candy) {
                candyList[counter] = (Candy) this.products[i];
                counter++;
            }
        }
        return candyList;
    }

    public CandyBar[] getCandyBar() {
        int productCounter = 0;
        for (Product currentProduct : this.products) {
            if (currentProduct instanceof CandyBar) {
                productCounter++;
            }
        }
        CandyBar[] candyBarList = new CandyBar[productCounter];
        int counter = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] instanceof CandyBar) {
                candyBarList[counter] = (CandyBar) this.products[i];
                counter++;
            }
        }
        return candyBarList;
    }

    public Product[] getAllProducts() {
        return this.products;
    }

    public void buyProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę produktu");
        String nameBuy = scanner.nextLine();
        System.out.println("Podaj ilość którą chcesz kupić");
        String quantityBuy = scanner.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(nameBuy)) {
                products[i].setQuantity(products[i].getQuantity() - parseInt(quantityBuy));
                System.out.println("Kupiono " + quantityBuy + " produktów o nazwie " + nameBuy);
                break;
            }
        }
    }
}
