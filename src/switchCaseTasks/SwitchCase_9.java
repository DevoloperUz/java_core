package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 16:56
 */
public class SwitchCase_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A-sonni kiriting:");
        int a = scanner.nextInt();
        System.out.println("B-sonni kiting:");
        int b = scanner.nextInt();

        System.out.println("Qaysi amalni bajarmoqchisiz?");

        System.out.println("1 - Qo'shish");
        System.out.println("2 - Ayirish");
        System.out.println("3 - Ko'paytirish");
        System.out.println("4 - Bo'lish");

        System.out.println("Tanlang:");
        byte num = scanner.nextByte();

        switch (num) {
            case 1 -> System.out.println("A + B = " + (a + b));
            case 2 -> System.out.println("A - B = " + (a - b));
            case 3 -> System.out.println("A * B = " + (a * b));
            case 4 -> System.out.println("A / B = " + (a / b));
            default -> System.out.println("Bunday tartib raqamli buyruq amali mavjud emas!");
        }
    }
}
