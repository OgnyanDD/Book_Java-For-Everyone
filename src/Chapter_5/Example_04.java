package Chapter_5;

public class Example_04 {
    public static void main(String[] args) {
        for (int x = 1, y = 10; x <= 10 && y >= 1; x++, y--) {
            System.out.println(x + " " + y);
        }
    }
}
/*
1 10
2 9
3 8
4 7
5 6
6 5
7 4
8 3
9 2
10 1
 */