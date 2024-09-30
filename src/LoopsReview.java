import java.util.Scanner;

public class LoopsReview {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }

        System.out.println("----------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int num = input.nextInt();

        while(num <= 0){
            System.out.println("Re-enter the positive number");
            num = input.nextInt();
        }

        System.out.println("You have entered: " + num);

        System.out.println("----------------------------");

        for (int i = 1; i < 31; i++) {
            if( i % 5 == 0){
                // break;
                continue;
            }
            System.out.print(i + " ");
        }


    }

}
