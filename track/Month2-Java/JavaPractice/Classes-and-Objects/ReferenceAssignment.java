
class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }

}

class ReferenceAssignment {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "John";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        Employee e2 = e1;
        e2.id = 2;
        e2.name = "Doe";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }
}
