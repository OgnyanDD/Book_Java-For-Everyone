package Chapter_4;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = in.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month with 31 days.");
                break;
            case 2:
                System.out.println("Month with 29 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month with 30 days.");
                break;
            default:
                System.out.println("Invalid month number!");
                break;
        }
    }
}
/*
6
Month with 30 days.
 */