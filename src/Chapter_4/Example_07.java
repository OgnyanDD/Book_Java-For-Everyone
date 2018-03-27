package Chapter_4;

import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = (a > b) ? a : b;
        System.out.println(c);
    }
}
/*
4
8
8
 */