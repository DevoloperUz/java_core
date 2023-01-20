package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 15:14
 */
public class If20_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X = ");
        int x = scanner.nextInt();
        System.out.println("Y = ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0)
            System.out.println(0);
        if (x != 0 && y == 0)
            System.out.println(1);
        if (x == 0 && y != 0)
            System.out.println(2);
        if (x != 0 && y != 0)
            System.out.println(3);
    }
}
