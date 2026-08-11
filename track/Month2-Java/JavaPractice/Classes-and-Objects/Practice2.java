
import java.util.Scanner;

class StudentUtility {

    void showReporTitle() {
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

class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentUtility su = new StudentUtility();
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int javaScore = sc.nextInt();
        int sqlScore = sc.nextInt();

        su.showReporTitle();
        su.displayStudent(id, name);
        double pass = su.getPassingPercentage();
        double average = su.calculatePercentage(javaScore, sqlScore);
        String result = (average >= pass) ? "PASS" : "NEEDS IMPROVEMENT";

        System.out.println("Percentage: " + average);
        System.out.println("Result: " + result);
        sc.close();

    }
}
