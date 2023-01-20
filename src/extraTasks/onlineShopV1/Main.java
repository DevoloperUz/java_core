package extraTasks.onlineShopV1;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 18/01/2023
 * Time: 18:20
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[3];

        System.out.println("\n***** Online Do'konimizga Xush Kelibsiz! *****\n");
        System.out.println("Omborda mahsulot yo'q. Iltmos oldin kiriting!\n");

        for (int i = 0; i < 3; i++) {

            System.out.print("Mahsulot turi: ");
            String type = scanner.nextLine();

            System.out.print("Mahsulot nomi: ");
            String name = scanner.nextLine();

            System.out.print("Mahsulot narxi: ");
            double price = scanner.nextDouble();

            System.out.print("Mahsulot miqdori: ");
            int amount = scanner.nextInt();

            scanner = new Scanner(System.in);
            System.out.print("Mahsulot o'lchov birligi (kg, litr, ta ...): ");
            String measure = scanner.nextLine();

            Product product = new Product(type, name, price, amount, measure);
            products[i] = product;

            System.out.println("\n" + product.getProductName() + " Omborga qo'shildi!!!\n");
        }
        boolean a = true;
        while (a) {
        System.out.println("Iltimos kerakli mahsulotni tanlang: ");
        int i = 1;
        for (Product product : products) {
            System.out.println(i + " - " + product.getProductName());
            i++;
        }
        System.out.println("0 - Exit");
        scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Iltimos optsiyani tanlang: ");
            System.out.println("1 - Sotib olish");
            System.out.println("2 - Omborga qo'shish");
            byte num2 = scanner.nextByte();
            if (num2 == 1) {
                System.out.println("Qancha sotib olmoqchisiz? Omborda " + products[0].getAmountOfProduct() + products[0].getMeasureOfProduct() + " qolgan.");
                int num3 = scanner.nextInt();
                products[0].setAmountOfProduct(products[0].getAmountOfProduct() - num3);
                System.out.println("\n ***** Haridingiz uchun tashakkur! ***** \n");
                System.out.println("Umumiy summa: " + products[0].getProductPrice() * num3 + " so'm");
                System.out.println("Mahsulot turi: " + products[0].getProductType());
                System.out.println("Mahsulot nomi: " + products[0].getProductName());
                System.out.println("Mahsulot miqdori: " + num3 + " " + products[0].getMeasureOfProduct() + "\n");
            }
            if (num2 == 2) {
                System.out.println("Omborga qancha qo'shmoqchisiz?");
                int num4 = scanner.nextInt();
                products[0].setAmountOfProduct(products[0].getAmountOfProduct() + num4);
                System.out.println("Omborga " + num4 + " " +
                        products[0].getMeasureOfProduct() + " " +
                        products[0].getProductName() + " qo'shildi. Jami: " +
                        products[0].getAmountOfProduct() + " " +
                        products[0].getMeasureOfProduct());
               }
            }
        if (num == 2) {
            System.out.println("Iltimos optsiyani tanlang: ");
            System.out.println("1 - Sotib olish");
            System.out.println("2 - Omborga qo'shish");
            byte num2 = scanner.nextByte();
            if (num2 == 1) {
                System.out.println("Qancha sotib olmoqchisiz? Omborda " + products[1].getAmountOfProduct() + products[1].getMeasureOfProduct() + " qolgan.");
                int num3 = scanner.nextInt();
                products[1].setAmountOfProduct(products[1].getAmountOfProduct() - num3);
                System.out.println("\n ***** Haridingiz uchun tashakkur! ***** \n");
                System.out.println("Umumiy summa: " + products[1].getProductPrice() * num3 + " so'm");
                System.out.println("Mahsulot turi: " + products[1].getProductType());
                System.out.println("Mahsulot nomi: " + products[1].getProductName());
                System.out.println("Mahsulot miqdori: " + num3 + " " + products[1].getMeasureOfProduct() + "\n");
            }
            if (num2 == 2) {
                System.out.println("Omborga qancha qo'shmoqchisiz?");
                int num4 = scanner.nextInt();
                products[1].setAmountOfProduct(products[1].getAmountOfProduct() + num4);
                System.out.println("Omborga " + num4 + " " +
                        products[1].getMeasureOfProduct() + " " +
                        products[1].getProductName() + " qo'shildi. Jami: " +
                        products[1].getAmountOfProduct() + " " +
                        products[1].getMeasureOfProduct());
            }
        }
        if (num == 3) {
            System.out.println("Iltimos optsiyani tanlang: ");
            System.out.println("1 - Sotib olish");
            System.out.println("2 - Omborga qo'shish");
            byte num2 = scanner.nextByte();
            if (num2 == 1) {
                System.out.println("Qancha sotib olmoqchisiz? Omborda " + products[2].getAmountOfProduct() + products[2].getMeasureOfProduct() + " qolgan.");
                int num3 = scanner.nextInt();
                products[2].setAmountOfProduct(products[2].getAmountOfProduct() - num3);
                System.out.println("\n ***** Haridingiz uchun tashakkur! ***** \n");
                System.out.println("Umumiy summa: " + products[2].getProductPrice() * num3 + " so'm");
                System.out.println("Mahsulot turi: " + products[2].getProductType());
                System.out.println("Mahsulot nomi: " + products[2].getProductName());
                System.out.println("Mahsulot miqdori: " + num3 + " " + products[2].getMeasureOfProduct() + "\n");
            }
            if (num2 == 2) {
                System.out.println("Omborga qancha qo'shmoqchisiz?");
                int num4 = scanner.nextInt();
                products[2].setAmountOfProduct(products[2].getAmountOfProduct() + num4);
                System.out.println("Omborga " + num4 + " " +
                        products[2].getMeasureOfProduct() + " " +
                        products[2].getProductName() + " qo'shildi. Jami: " +
                        products[2].getAmountOfProduct() + " " +
                        products[2].getMeasureOfProduct());
            }
        }
        if (num == 0) {
            a = false;
            System.out.println("\nXaridingiz uchun tashakkur!");
        }
        }
    }
}