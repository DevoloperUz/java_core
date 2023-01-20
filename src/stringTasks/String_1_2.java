package stringTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 17:13
 */
public class String_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-matn:");
        String str1 = scanner.nextLine();
        System.out.println("2-matn");
        String str2 = scanner.nextLine();

        System.out.println(str1.concat(" " +str2));
        String string = new StringBuilder(str1).reverse().toString();
        System.out.println(string);
    }
}
