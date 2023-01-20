package arrayTasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 21:23
 */
public class Array_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n = ");
        int num = scanner.nextInt();

        int[] nums = new int[num];

        int count = 0;
        for (int i = 1; i < 2 * num; i++) {
            if (i % 2 == 1) {
                nums[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
