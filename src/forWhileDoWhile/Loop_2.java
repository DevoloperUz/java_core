package forWhileDoWhile;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 17:59
 */
public class Loop_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x: ");
        int x = scanner.nextInt();
        System.out.println("y: ");
        int y = scanner.nextInt();
        System.out.println("p: ");
        int p = scanner.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % p == 0)
                System.out.print(i + " ");
        }
    }
}
