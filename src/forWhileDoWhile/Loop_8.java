package forWhileDoWhile;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 21:09
 */
public class Loop_8 {
    public static void main(String[] args) {
        for (int i = 100; i < 501; i++) {
            int c = i % 10;
            int a = i / 100;
            int x = i / 10;
            int b = x % 10;
            if (a + b + c == 15)
                System.out.print(i + " ");
        }
    }
}
