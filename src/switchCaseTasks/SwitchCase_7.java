package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 16:39
 */
public class SwitchCase_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oy raqamini kiriting: ");
        byte num = scanner.nextByte();

        switch (num) {
            case 12, 1, 2 -> System.out.println("Qish");
            case 3, 5, 4 -> System.out.println("Bahor");
            case 6, 7, 8 -> System.out.println("Yoz");
            case 9, 10, 11 -> System.out.println("Kuz");
            default -> System.out.println("Xato");
        }
    }
}
