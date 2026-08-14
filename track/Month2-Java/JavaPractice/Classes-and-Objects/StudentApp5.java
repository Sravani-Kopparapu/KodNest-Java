
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Default name";
        age = 20;
        height = 5.6;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

class StudentApp5 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Sneha");
        s2.display();
        Student s3 = new Student("Anu", 26, 5.4);
        s3.display();
    }
}
