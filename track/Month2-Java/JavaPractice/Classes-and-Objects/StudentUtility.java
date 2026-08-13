
import java.util.Scanner;

class StudentU {

// Create the four required methods
    void showReportTitle() {
        System.out.println("Student Performance Report");

    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);

        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {

        return 60.0;

    }

    double calculatePercentage(int javaScore, int sqlScore) {

        double average = (javaScore + sqlScore) / 2.0;

        return average;

    }

}

public class StudentUtility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentU utility = new StudentU();

        int studentId = scanner.nextInt();

        scanner.nextLine();

        String fullName = scanner.nextLine();

        int javaScore = scanner.nextInt();

        int sqlScore = scanner.nextInt();

// Read input, call methods and display the result
        utility.showReportTitle();

        utility.displayStudent(studentId, fullName);

        double pass = utility.getPassingPercentage();

        double average = utility.calculatePercentage(javaScore, sqlScore);

        String result = (average >= pass) ? "PASS" : "NEEDS IMPROVEMENT";

        System.out.println("Percentage: " + average);

        System.out.println("Result: " + result);

        scanner.close();

    }
}
