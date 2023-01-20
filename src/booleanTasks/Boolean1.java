package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 16:31
 */
public class Boolean1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String answer = a > 0 ? "A soni musbat" : "A soni manfiy";
        System.out.println(answer);
    }
}
