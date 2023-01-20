package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 16:46
 */
public class SwitchCase_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oy tartib raqamini kiriting: ");
        byte num = scanner.nextByte();

        switch (num) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Bu oyda 31 kun bor!");
            case 4, 6, 9, 11 -> System.out.println("Bu oyda 30 kun bor!");
            case 2 -> System.out.println("Bu oyda 28 yoki 29 kun bor!");
            default -> System.out.println("Xato");
        }
    }
}
