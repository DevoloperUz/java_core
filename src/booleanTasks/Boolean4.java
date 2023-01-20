package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 16:45
 */
public class Boolean4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A ni kiriting:");
        int a = scanner.nextInt();
        System.out.println("B ni kiriting:");
        int b = scanner.nextInt();
        System.out.println("C ni kiriting:");
        int c = scanner.nextInt();

        String answer = ((b > a) && (b < c)) ? "B soni A va C sonlari orasida yotadi" : "B soni A va C sonlari orasida yotmaydi";
        System.out.println(answer);
    }
}
