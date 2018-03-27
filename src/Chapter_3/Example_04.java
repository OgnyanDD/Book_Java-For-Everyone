package Chapter_3;

public class Example_04 {
    public static void main(String[] args) {

        int number = 0b110101;
        int invertedNumber = ~number;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(invertedNumber));
    }
}
/*
110101
11111111111111111111111111001010
 */