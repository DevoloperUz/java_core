package forWhileDoWhile;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 18:04
 */
public class Loop_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        System.out.println("0 dan " + num + " gacha bo'lgan barcha butun sonlar yig'indisi " + sum + " ga teng.");
    }
}
