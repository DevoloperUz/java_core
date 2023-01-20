package forWhileDoWhile;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 18:10
 */
public class Loop_4 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int c = i % 10;
            int a = i / 100;
            int x = i / 10;
            int b = x % 10;
            if (a != b && b != c && a != c)
                System.out.print(i + " ");
        }
    }
}
