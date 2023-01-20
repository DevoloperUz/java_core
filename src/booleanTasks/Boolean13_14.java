package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:05
 */
public class Boolean13_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Son kiriting:");
        int a = scanner.nextInt();

        String answer  = (a > 9 && a < 100 && a % 2 == 0) ? "Berilgan son 2 xonali juft son" : "Berilgan son 2 xonali juft son emas";
        System.out.println(answer);
    }
}
