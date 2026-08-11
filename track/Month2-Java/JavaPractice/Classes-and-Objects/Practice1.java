
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    // Print the greeting
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Return 7
    int getLuckyNumber() {
        return 7;
    }

    // Return the sum
    int add(int first, int second) {
        int sum = first + second;
        return sum;
    }
}

public class Practice1 {

    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        int lucky = demo.getLuckyNumber();

        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();

        demo.sayHello();
        demo.greet(name);
        System.out.println("Lucky number: " + lucky);

        int result = demo.add(num1, num2);
        System.out.println("Sum: " + result);

        s.close();
    }
}
