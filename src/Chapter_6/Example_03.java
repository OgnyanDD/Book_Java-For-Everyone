package Chapter_6;

public class Example_03 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6};
        int[] arr2 = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            arr2[index] = arr[index];
        }
        arr2[1] = 3;
        System.out.println(arr[1]); // 8
    }
}
