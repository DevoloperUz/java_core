package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:14
 */
public class Boolean15_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A:");
        int a = scanner.nextInt();
        System.out.println("B:");
        int b = scanner.nextInt();
        System.out.println("C:");
        int c = scanner.nextInt();

        String answer = (a == b || a == c || b == c) ? "Berilgan sonlarning hech bo'lmaganda bir jufti bir-biriga teng" : "Berilgan sonlarning hech biri bir-biriga teng emas";
        System.out.println(answer);
    }
}
