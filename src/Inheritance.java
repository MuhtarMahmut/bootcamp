interface RemoteWork{
    void workFromHome();
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

final class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }

}

final class Teacher extends  Person implements RemoteWork{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(this.name + " is teaching");
    }

    @Override
    public void workFromHome() {
        System.out.println(this.name + " is teaching from home");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Student student = new Student("John", 25);
        Teacher teacher = new Teacher("Smith", 55);

        System.out.println(student);
        System.out.println(teacher);

        student.study();
        teacher.teach();

        final String name = "CYDEO";

        //name = null;
       // name = "Harvard";

        System.out.println("---------");

        Person person =new Student("John", 25);

        System.out.println(person);

        ((Student) person).study();

        person = new Teacher("Smith", 55);

        System.out.println(person);

    }


}
