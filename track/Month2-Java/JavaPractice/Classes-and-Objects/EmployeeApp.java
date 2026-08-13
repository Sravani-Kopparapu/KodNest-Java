
import java.util.Scanner;

class Employee {

    String name;

    double salary;

    void setDetails(String name, double salary) {

// Store both parameters in the instance variables
        this.name = name;

        this.salary = salary;

    }

    void displayDetails() {

// Print the stored name and salary
        System.out.println("Employee Name: " + this.name);

        System.out.println("Salary: " + this.salary);

    }

}

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double salary = scanner.nextDouble();

        Employee e1 = new Employee();

        e1.setDetails(name, salary);

        e1.displayDetails();

    }

}
