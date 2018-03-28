package Chapter_5;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int x = 1; x <= n ; x++) {
            if (x == 100) {
                break;
            }
            System.out.println(x);
        }
    }
}
/*

1
2
3
...
99
 */