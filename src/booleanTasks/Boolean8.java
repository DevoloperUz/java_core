package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 17:15
 */
public class Boolean8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A ni kiriting:");
        int a = scanner.nextInt();
        System.out.println("B ni kiriting:");
        int b = scanner.nextInt();

        String answer = ((a % 2 == 0) && (b % 2 == 0)) || ((a % 2 == 1) && (b % 2 == 1)) ? "A va B sonlarning ikkalasi ham toq son yoki juft son" : "A va B sonlarning ikkalasi ham toq son yoki juft son emas";
        System.out.println(answer);
    }
}
