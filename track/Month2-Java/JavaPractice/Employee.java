
class Employee {

    String name;
    int empid;
    double salary;
    String email;

    Employee(String name, int empid, double salary, String email) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
        this.email = email;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + empid);
        System.out.println("Employee salary: " + salary);
        System.out.println("EMployee Email Id: " + email);
    }
}
