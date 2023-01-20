package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:30
 */
public class If1_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Son kiriting:");
        int num = scanner.nextInt();

        if (num > 0) {
            num++;
            System.out.println(num);
        } else if (num < 0) {
            num-= 2;
            System.out.println(num);
        } else {
            num = 10;
            System.out.println(num);
        }
    }
}
