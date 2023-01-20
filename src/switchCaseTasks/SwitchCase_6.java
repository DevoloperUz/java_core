package switchCaseTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 16:35
 */
public class SwitchCase_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bahoyinggizni kiriting; ");
        byte mark = scanner.nextByte();

        switch (mark) {
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("Qoniqarsiz");
            case 3 -> System.out.println("Qoniqarli");
            case 4 -> System.out.println("Yaxshi");
            case 5 -> System.out.println("A'lo");
            default -> System.out.println("Xato");
        }
    }
}
