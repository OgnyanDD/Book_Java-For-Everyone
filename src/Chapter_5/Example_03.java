package Chapter_5;

import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = 0;
        do {
            System.out.println("Въведете число между 1 и 10");
            input = in.nextInt();
        } while (input <1 || input > 10);
    }
}
/*
Въведете число между 1 и 10
0
Въведете число между 1 и 10
20
Въведете число между 1 и 10
5
 */