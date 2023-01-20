package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 17:22
 */
public class Boolean9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A ni kiriting:");
        int a = scanner.nextInt();
        System.out.println("B ni kiriting:");
        int b = scanner.nextInt();
        System.out.println("C ni kiriting:");
        int c = scanner.nextInt();

        String answer = ((a > 0) && (b > 0) && (c > 0)) ? "A, B va C sonlarning barchasi musbat" : "A, B va C sonlarning orasida manfiy son yoki 0 mavjud";
        System.out.println(answer);
    }
}
