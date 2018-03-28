package Chapter_5;

public class Example_07 {
    public static void main(String[] args) {

        for (int x = 1; x <= 10 ; x++) {
            if (x >= 6 && x <= 9) {
                continue;
            }
            System.out.println(x);
        }
    }
}
/*
1
2
3
4
5
10
 */