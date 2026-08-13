
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentApp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create and populate first student
        Student s1 = new Student();

        s1.registrationId = sc.nextInt();
        sc.nextLine();
        s1.name = sc.nextLine();
        s1.attendancePercentage = sc.nextDouble();

        // Create and populate second student
        Student s2 = new Student();

        s2.registrationId = sc.nextInt();
        sc.nextLine();
        s2.name = sc.nextLine();
        s2.attendancePercentage = sc.nextDouble();

        // Read the selected ID and new attendance
        int id = sc.nextInt();
        double attendance = sc.nextDouble();

        // Make selected refer to the matching existing object
        Student selected = null;

        if (id == s1.registrationId) {
            selected = s1;
        } else if (id == s2.registrationId) {
            selected = s2;
        }

        // Update only if a matching student was found
        if (selected == null) {
            System.out.println("Student not found.");
        } else {
            selected.attendancePercentage = attendance;

            System.out.println("Selected Student: " + selected.name);
        }

        // Display both records
        System.out.println(
                s1.registrationId + " "
                + s1.name + " "
                + s1.attendancePercentage + "%"
        );

        System.out.println(
                s2.registrationId + " "
                + s2.name + " "
                + s2.attendancePercentage + "%"
        );

        sc.close();
    }
}
