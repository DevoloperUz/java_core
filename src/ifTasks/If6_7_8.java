package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:54
 */
public class If6_7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a =");
        int a = scanner.nextInt();
        System.out.println("b =");
        int b = scanner.nextInt();

        if (a > b)
            System.out.println(a + "\n" + b);
        else if (b > a)
            System.out.println(b + "\n" + a);
        else
            System.out.println("Bu sonlar bir-biriga teng");
    }
}
