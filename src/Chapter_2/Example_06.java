package Chapter_2;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = in.nextDouble();
        System.out.println("Enter second number:");
        double num2 = in.nextDouble();
        double result = num1 + num2;

        System.out.println("The result is: " + result);
    }
}
/*
Enter first number:
5
Enter second number:
6
The result is: 11.0
 */