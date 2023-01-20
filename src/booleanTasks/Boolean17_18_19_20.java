package booleanTasks;

import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 15/01/2023
 * Time: 19:20
 */
public class Boolean17_18_19_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3 xonali son kiriting");
        int abc = scanner.nextInt();

        int c = abc % 10;
        int a = abc / 100;
        int i = abc / 10;
        int b = i % 10;

        String answer = (a != b && a != c && b != c) ? "Ushbu sonning barcha raqamlari xar xil" : "Ushbu sonda bir biriga teng raqamlar mavjud";
        System.out.println(answer);
    }
}
