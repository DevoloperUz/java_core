package forWhileDoWhile;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 17:53
 */
public class Loop_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qaysi son karra jadvali kerak? Kiriting: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int x = num * i;
            System.out.println(num + " * " + i + " = " + x);
        }
    }
}
