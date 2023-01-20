package extraTasks.invoice;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 19/01/2023
 * Time: 20:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Invoice invoice1 = new Invoice("742-0001", 150, false);
        Invoice invoice2 = new Invoice("742-0002", 250, false);
        Invoice invoice3 = new Invoice("742-0003", 350, false);
        Invoice invoice4 = new Invoice("742-0004", 450, false);
        Invoice invoice5 = new Invoice("742-0005", 550, false);

        Invoice[] invoices = new Invoice[5];
        invoices[0] = invoice1;
        invoices[1] = invoice2;
        invoices[2] = invoice3;
        invoices[3] = invoice4;
        invoices[4] = invoice5;

        while (true) {
            System.out.println("To'lov amalga oshiriladigan foydalanuvchi ma'lumotlarini kiriting (0 - Exit): ");
            scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals("0")) {
                System.out.println("Xizmatimizdan foydalanganingiz uchun rahmat");
                return;
            }
            System.out.println("To'lov qilmoqchi bo'lgan invoice raqamini kiriting: ");
            String invoice = scanner.nextLine();
            for (Invoice item : invoices) {
                if (item.getInvoiceNumber().equals(invoice)) {
                    System.out.println("\nInvoice raqami: " + invoice);
                    if (item.isStatus()) {
                        System.out.println("To'lov holati: To'langan");
                    } else {
                        System.out.println("To'lov holati: To'lanmagan");
                    }
                    System.out.println("To'lovchi: " + item.getPaidBy());
                    System.out.println("Siz " + item.getCost() + "$ to'lashingiz kerak\n");

                    System.out.println("Siz qancha to'lov qilmoqchisiz?");
                    int cost = scanner.nextInt();
                    if (item.getCost() - cost > 0) {
                        item.setCost(item.getCost() - cost);
                        System.out.println("To'lov miqdori qisman to'landi! Qoldiq miqdori: " + item.getCost() + "\n");
                        item.setPaidBy(name);
                    }
                    if (item.getCost() - cost == 0) {
                        item.setStatus(true);
                        System.out.println("To'lov miqdori to'liq to'landi!");
                        item.setPaidBy(name);
                    }
                }
            }
        }
    }
}
