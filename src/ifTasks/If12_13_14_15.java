package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 20:07
 */
public class If12_13_14_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-son");
        int a = scanner.nextInt();
        System.out.println("2-son");
        int b = scanner.nextInt();
        System.out.println("3-son");
        int c = scanner.nextInt();

        if (a > b && b > c)
            System.out.println(a + b);
        else if (a > b && c > b)
            System.out.println(a + c);
        else if (b > a && a > c)
            System.out.println(b + a);
        else if (b > a && c > a)
            System.out.println(b + c);
    }
}
