package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 14:55
 */
public class If16_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println(a + "\n" + b + "\n" + c);
        } else if (a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println(a + "\n" + b + "\n" + c);
        } else {
            a =-a;
            b = -b;
            c = -c;
            System.out.println(a + "\n" + b + "\n" + c);
        }
    }
}
