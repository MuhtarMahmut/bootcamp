public class MethodsReview {

    public static void main(String[] args) {

        System.out.println("Test 1");
        pause(2);
        System.out.println("Test 2");
        pause(3);
        System.out.println("Test 3");

        System.out.println("------------------------------");

        System.out.println("Test 1");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test 2");
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test 3");


        System.out.println("------------------------------");

        int[] nums = {1, 2, 3, 4, 5};
        String[] names = {"Java", "Selenium", "API"};

        printReversed(nums);
        printReversed(names);


    }

    public static void pause(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printReversed(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void printReversed(String[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


}
