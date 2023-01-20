package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:59
 */
public class If9_10_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();

        if (a > b) {
            b = a;
            System.out.println(a + "\n" + b);
        } else if (b > a) {
            a = b;
            System.out.println(a + "\n" + b);
        } else {
            a = 0;
            b = 0;
            System.out.println(a + "\n" + b);
        }
    }
}
