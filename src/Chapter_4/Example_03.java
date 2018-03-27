package Chapter_4;

import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        if (number > 0) {
            System.out.println("Числото е положително.");
        } else {
            if (number == 0) {
                System.out.println("Числото е равно на 0.");
            } else {
                System.out.println("Числото е отрицателно.");
            }
        }
    }
}
/*
-1
Числото е отрицателно.
 */