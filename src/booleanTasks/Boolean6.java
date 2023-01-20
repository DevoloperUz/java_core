package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 16:57
 */
public class Boolean6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A ni kiriting:");
        int a = scanner.nextInt();
        System.out.println("B ni kiriting:");
        int b = scanner.nextInt();

        String answer = ((a % 2 == 1) || (b % 2 == 1)) ? "A va B sonlardan hech bo'lmaganda bittasi toq" : "A va B sonlarning hech biri toq emas";
        System.out.println(answer);
    }
}
