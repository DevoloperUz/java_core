package extraTasks.myBanking;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 18/01/2023
 * Time: 16:02
 */
public class MyBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ismi: ");
        String name = scanner.nextLine();

        System.out.print("Familiyasi: ");
        String surname = scanner.nextLine();

        System.out.print("Balansi: ");
        double balance = scanner.nextDouble();
        double check = balance;

        boolean a = true;
        while (a) {

            System.out.println("\n========== Welcome To My Bank App ==========\n");
            System.out.println("1 - Balans");
            System.out.println("2 - Pul qo'yish");
            System.out.println("3 - Pul yechish");
            System.out.println("4 - Oxirgi operatsiya");
            System.out.println("0 - Chiqish");

            byte num = scanner.nextByte();
            switch (num) {
                case 1 -> System.out.println(name + " " + surname +" Hisobingizdagi mablag': " + balance + "$\n");
                case 2 -> {
                    System.out.println("Qancha pul qo'ymoqchisiz: ");
                    double money = scanner.nextDouble();

                    if (money > 0) {
                        System.out.println("Pul qo'yishni tasdiqlaysizmi? \n Y - Ha \n N - Yo'q");
                        scanner = new Scanner(System.in);
                        String answer = scanner.nextLine();
                        if (answer.equals("Y")) {
                            balance += money;
                            System.out.println("Joriy balansingiz: " + balance + "$");
                        } else if (answer.equals("N")) {
                            System.out.println("Operatsiya bekor qilindi!");
                        } else {
                            System.out.println("Xatolik!");
                        }
                    } else {
                        System.out.println("Xatolik! Qiymat musbat bo'lishi lozim!");
                    }
                }
                case 3 -> {
                    System.out.println("Qancha pul yechmoqchisiz: ");
                    double money = scanner.nextDouble();

                    if (money > 0 && money <= balance) {
                    System.out.println("Pul yechishni tasdiqlaysizmi? \n Y - Ha \n N - Yo'q");
                    scanner = new Scanner(System.in);
                        String answer = scanner.nextLine();
                        if (answer.equals("Y") && money <= balance) {
                            balance -= money;
                            System.out.println("Joriy balansingiz: " + balance + "$");
                        } else if (answer.equals("N")) {
                            System.out.println("Operatsiya bekor qilindi!");
                        } else {
                            System.out.println("Xatolik!");
                        }
                    } else {
                        System.out.println("Xatolik! Qiymat musbat va balansdan katta bo'lmasligi lozim!");
                    }
                }
                case 4 -> {
                    if (check > balance) {
                        System.out.println("Oxirgi operatsiyada hisobingizdan: " + (check - balance) + "$" + " yechildi!");
                    } else if (check < balance) {
                        System.out.println("Oxirgi operatsiyada hisobingizga: " + (balance - check) + "$" + " qo'yildi!");
                    } else {
                        System.out.println("Oxirgi operatsiyalar mavjud emas!");
                    }
                }
                case 0 -> {
                    a = false;
                    System.out.println("Xizmatimizdan foydalanganingiz uchun rahmat!");
                }
            }
        }
    }
}
