package forWhileDoWhile;

/**
 * Author: Home PC
 * Date: 16/01/2023
 * Time: 21:12
 */
public class Loop_10 {
    public static void main(String[] args) {
        for (int i = 30; i < 101; i++) {
            if ((i % 3 == 0) && (i % 10 == 2 || i % 10 == 4 || i % 10 == 8))
                System.out.print(i + " ");
        }
    }
}
