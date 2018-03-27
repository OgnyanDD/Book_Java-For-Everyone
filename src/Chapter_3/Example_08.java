package Chapter_3;

public class Example_08 {
    public static void main(String[] args) {
        int x = 0b10000000000000000000000000000001;
        int xOneRight = x >> 1;
        int xOneLeft = x << 1;
        System.out.println("Original number");
        System.out.println(Integer.toBinaryString(x));
        System.out.println("Shifted right and left by 1");
        System.out.println(Integer.toBinaryString(xOneRight));
        System.out.println(Integer.toBinaryString(xOneLeft));
        int xTwoRight = x >> 2;
        int xTwoLeft = x << 2;
        System.out.println("Shifted right and left by 2");
        System.out.println(Integer.toBinaryString(xTwoRight));
        System.out.println(Integer.toBinaryString(xTwoLeft));
    }
}
/*
Original number
10000000000000000000000000000001
Shifted right and left by 1
11000000000000000000000000000000
10
Shifted right and left by 2
11100000000000000000000000000000
100
 */