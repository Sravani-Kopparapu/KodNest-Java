
class Student {

    String name;
    int roll;
    double height;

    void study() {
        System.out.println("Student is Studying");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }
}

public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Atharv";
        s1.roll = 15;
        s1.height = 5.11;

        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.height);
        s1.study();
        s1.sleep();

    }
}
