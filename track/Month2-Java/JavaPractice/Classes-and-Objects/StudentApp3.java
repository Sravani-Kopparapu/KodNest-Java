
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void displayName() {

// Print the stored name
        System.out.println("Student Name: " + this.name);

    }

}

public class StudentApp3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();

        String name = scanner.nextLine();

        s1.setName(name);
        s1.displayName();
    }
}
