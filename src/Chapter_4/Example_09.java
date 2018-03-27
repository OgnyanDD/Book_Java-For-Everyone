package Chapter_4;

import java.util.Scanner;

public class Example_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int age = in.nextInt();
        if (age < 18 || age > 65) {
            System.out.println("Човекът е в неработоспособна възраст.");
        } else {
            System.out.println("Човекът е в работоспособна възраст.");
        }
    }
}
/*
25
Човекът е в работоспособна възраст.
 */