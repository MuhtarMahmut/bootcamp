import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        arr[0] = 100;

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");

        for (int each : arr) {
            System.out.println(each);
        }

        System.out.println("---------------------");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


    }

}
