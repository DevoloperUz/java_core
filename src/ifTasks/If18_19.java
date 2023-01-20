package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 15:03
 */
public class If18_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-son");
        int a = scanner.nextInt();
        System.out.println("2-son");
        int b = scanner.nextInt();
        System.out.println("3-son");
        int c = scanner.nextInt();
        System.out.println("4-son");
        int d = scanner.nextInt();

        if (a == b && b == c && c != d )
            System.out.println("4-son");
        if (a == b && b == d && d != c )
            System.out.println("3-son");
        if (a == c && c == d && d != b )
            System.out.println("2-son");
        if (c == b && b == d && d != a )
            System.out.println("1-son");
    }
}
