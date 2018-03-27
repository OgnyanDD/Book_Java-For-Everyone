package Chapter_2;

public class Example_08 {
    public static void main(String[] args) {

        int x = 5;
        x++;
        System.out.println("X is " + x); // X is 6
        int y = x++;
        System.out.println("Y is " + y + " and X is " + x); // Y is 6 and X is 7
        y = ++x;
        System.out.println("Now Y is " + y + " and X is " + x); // Now Y is 8 and X is 8
    }
}
