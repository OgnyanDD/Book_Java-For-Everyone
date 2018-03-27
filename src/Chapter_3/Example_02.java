package Chapter_3;

public class Example_02 {
    public static void main(String[] args) {

        int number1 = 24;
        int number2 = 372;
        System.out.println(Integer.toBinaryString(number1));
        System.out.println(Integer.toBinaryString(number2));
        System.out.println("Other transformations:");
        int number3 = 11;
        System.out.println(Integer.toString(number3, 2));  // преобразуване в двоична бройна система
        System.out.println(Integer.toString(number3, 8));  // преобразуване в осмична бройна система
        System.out.println(Integer.toString(number3, 16)); // // преобразуване в шестнадесетична бройна система
    }
}
/*
11000
101110100
Other transformations:
1011
13
b
 */