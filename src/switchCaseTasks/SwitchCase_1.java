package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 15:29
 */
public class SwitchCase_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oy tartib raqamini kiriting: ");
        byte num = scanner.nextByte();

        switch (num) {
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Iyun");
            case 7 -> System.out.println("Iyul");
            case 8 -> System.out.println("Avgust");
            case 9 -> System.out.println("Sentabr");
            case 10 -> System.out.println("Oktabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Dekabr");
            default -> System.out.println("Bunday tartib raqamli oy mavjud emas");
        }
    }
}
