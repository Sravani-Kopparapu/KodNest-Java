// Shadowing problem solution using "this" keyword

class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
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

class StudentApp1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Ram", 18, 5.9);
        s1.display();
    }
}
