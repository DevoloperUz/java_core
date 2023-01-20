package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 15:51
 */
public class SwitchCase_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fasl tartib raqamini kiritng: ");
        byte num = scanner.nextByte();

        switch (num) {
            case 1 -> {
                System.out.println("Qish: ");
                System.out.println("Dekabr");
                System.out.println("Yanvar");
                System.out.println("Fevral");
            }
            case 2 -> {
                System.out.println("Bahor: ");
                System.out.println("Mart");
                System.out.println("Aprel");
                System.out.println("May");
            }
            case 3 -> {
                System.out.println("Yoz: ");
                System.out.println("Iyun");
                System.out.println("Iyul");
                System.out.println("Avgust");
            }
            case 4 -> {
                System.out.println("Kuz: ");
                System.out.println("Sentabr");
                System.out.println("Oktabr");
                System.out.println("Noyabr");
            }
            default -> System.out.println("Faqat 1 dan 4 gacha bo'lgan raqamlarni kiritish mumkin!");
        }
    }
}
