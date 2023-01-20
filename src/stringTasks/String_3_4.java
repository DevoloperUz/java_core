package stringTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 17:25
 */
public class String_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matn kiriting:");
        String str = scanner.nextLine();

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
