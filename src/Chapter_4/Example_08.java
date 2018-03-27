package Chapter_4;

import java.util.Scanner;

public class Example_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int age = in.nextInt();
        if (age > 0 && age <= 100) {
            System.out.println("Валидни години за човек.");
        } else {
            System.out.println("Невалидни години за човек.");
        }
    }
}
/*
55
Валидни години за човек.
 */