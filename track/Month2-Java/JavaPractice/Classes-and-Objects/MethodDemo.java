
import java.util.Scanner;

class MethodD {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello," + name + "!");
    }

    int getLuckyNumber() {

        return 7;

    }

    int add(int first, int second) {

        int sum = first + second;

        return sum;

    }

}

public class MethodDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MethodD m = new MethodD();

        String name = scanner.nextLine();

        int first = scanner.nextInt();

        int second = scanner.nextInt();

        m.sayHello();

        m.greet(name);

        int luckyNumber = m.getLuckyNumber();

        System.out.println("Lucky Number: " + luckyNumber);

        int sum = m.add(first, second);

        System.out.println("Sum: " + sum);

    }
}
