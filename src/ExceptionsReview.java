public class ExceptionsReview {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test 1");

        Thread.sleep(2 * 1000);

        System.out.println("Test 2");

        Thread.sleep(3 * 1000);

        System.out.println("Test 3");

        System.out.println("----------------------------------");

        try {
            System.out.println("Java".charAt(10000));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        System.out.println("test Completed");

    }

}
