package Chapter_6;

public class Example_04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6};
        int[] arr2 = {5, 8, 2, 1, 6};
        if (arr.length != arr2.length) {
            System.out.println("Масивите са различни.");
        } else {
            int index = 0;
            for (index = 0; index < arr.length; index++) {
                if (arr[index] != arr2[index]) {
                    System.out.println("Масивите са различни.");
                    break;
                }
            }
            if (index == arr.length) {
                System.out.println("Масивите са еднакви."); //Масивите са еднакви.
            }
        }
    }
}
