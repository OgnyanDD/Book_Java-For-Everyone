package Chapter_4;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dayOfWeek = in.nextInt();
        if (dayOfWeek == 1) {
            System.out.println("Понеделник");
        } else {
            if (dayOfWeek == 2) {
                System.out.println("Вторник");
            } else {
                if (dayOfWeek == 3) {
                    System.out.println("Сряда");
                } else {
                    if (dayOfWeek == 4) {
                        System.out.println("Четвъртък");
                    } else {
                        if (dayOfWeek == 5) {
                            System.out.println("Петък");
                        } else {
                            if (dayOfWeek == 6) {
                                System.out.println("Събота");
                            } else {
                                if (dayOfWeek == 7) {
                                    System.out.println("Неделя");
                                } else {
                                    System.out.println("Няма такъв ден!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
/*
3
Сряда
 */