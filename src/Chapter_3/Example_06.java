package Chapter_3;

public class Example_06 {
    public static void main(String[] args) {

        int x = 0b110101;
        int y = 0b111000;
        int z = x | y;
        System.out.println(Integer.toBinaryString(z));
    }
}
// 111101