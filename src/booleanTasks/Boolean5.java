package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 16:52
 */
public class Boolean5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A sonini kiriting:");
        int a = scanner.nextInt();
        System.out.println("B sonini kiriting:");
        int b = scanner.nextInt();

        String answer = ((a % 2 == 1) && (b % 2 == 1)) ? "A va B sonlar toq sonlar" : "A va B sonlar toq sonlar emas";
        System.out.println(answer);
    }
}
