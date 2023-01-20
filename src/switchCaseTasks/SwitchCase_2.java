package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 15:42
 */
public class SwitchCase_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oy tartib raqamini kiritng");
        byte num = scanner.nextByte();

        switch (num) {
            case 12 -> System.out.println("Qish");
            case 1 -> System.out.println("Qish");
            case 2 -> System.out.println("Qish");
            case 3 -> System.out.println("Bahor");
            case 4 -> System.out.println("Bahor");
            case 5 -> System.out.println("Bahor");
            case 6 -> System.out.println("Yoz");
            case 7 -> System.out.println("Yoz");
            case 8 -> System.out.println("Yoz");
            case 9 -> System.out.println("Kuz");
            case 10 -> System.out.println("Kuz");
            case 11 -> System.out.println("Kuz");
            default -> System.out.println("Bunday tartib raqamli oy mavjud emas!");
        }
    }
}
