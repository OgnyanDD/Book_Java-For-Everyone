package Chapter_4;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int number = in.nextInt();
        if (number > 0) {
            System.out.println("Числото е положително.");
        } else {
            System.out.println("Числото е 0 или отрицателно.");
        }
    }
}
/*
0
Числото е 0 или отрицателно.
 */