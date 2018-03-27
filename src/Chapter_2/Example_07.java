package Chapter_2;

import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long num1 = in.nextLong();
        long num2 = in.nextLong();
        long num3 = in.nextLong();
        boolean result = (num1 + num2) == num3;
        System.out.println(result);
    }
}
/*
5
6
11
true
 */