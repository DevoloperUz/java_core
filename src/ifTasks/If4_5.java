package ifTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:37
 */
public class If4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0)
            System.out.println("3 ta son ham musbat");
        else if (a == 0 && b == 0 && c == 0)
            System.out.println("3 ta son ham 0 ga teng");
        else if (a < 0 && b < 0 && c < 0)
            System.out.println("3 ta son ham manfiy");
        else if (a < 0 && b > 0 && c > 0)
            System.out.println("Sonlardan 1 tasi manfiy 2 tasi musbat");
        else if (a < 0 && b < 0 && c > 0)
            System.out.println("Sonlardan 2 tasi manfiy 1 tasi musbat");
        else if (a > 0 && b < 0 && c < 0)
            System.out.println("Sonlardan 2 tasi manfiy 1 tasi musbat");
        else if (a > 0 && b > 0 && c < 0)
            System.out.println("Sonlardan 1 tasi manfiy 2 tasi musbat");
        else if (a > 0 && b < 0 && c > 0)
            System.out.println("Sonlardan 1 tasi manfiy 2 tasi musbat");
        else if (a < 0 && b > 0 && c < 0)
            System.out.println("Sonlardan 2 tasi manfiy 1 tasi musbat");
    }
}
