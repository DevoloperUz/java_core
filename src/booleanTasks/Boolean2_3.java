package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 16:40
 */
public class Boolean2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String answer = a % 2 == 0 ? "A soni juft son" : "A soni toq son";
        System.out.println(answer);
    }
}
