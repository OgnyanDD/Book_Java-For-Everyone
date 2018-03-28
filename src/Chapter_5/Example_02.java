package Chapter_5;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int x = 1;
        while (x <= number) {
            System.out.println(x);
            x++;
        }
    }
}
/*
5
1
2
3
4
5
 */