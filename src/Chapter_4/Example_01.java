package Chapter_4;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        }
    }
}
/*
5
The number is positive.
 */