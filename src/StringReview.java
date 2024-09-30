public class StringReview {

    public static void main(String[] args) {

        String str1 = "CYDEO";
        String str2 = "CYDEO";
        String str3 = "CYDEO";

        str1.concat(" School");

        System.out.println(str1);

        StringBuilder sb1 = new StringBuilder("CYDEO");
        sb1.append(" School");

        System.out.println(sb1);


    }

}
