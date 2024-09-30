class Spartan{
    String name;
    static String goal = "Become an SDET";

    public Spartan(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", goal='" + goal + '\'' +
                '}';
    }
}



public class ClassAndObject {

    public static void main(String[] args) {

        Spartan spartan1 = new Spartan("John");
        Spartan spartan2 = new Spartan("Bella");
        Spartan spartan3 = new Spartan("Aaron");

        spartan1.goal = "Become a Developer";

        System.out.println(spartan1);
        System.out.println(spartan2);
        System.out.println(spartan3);

    }

}
