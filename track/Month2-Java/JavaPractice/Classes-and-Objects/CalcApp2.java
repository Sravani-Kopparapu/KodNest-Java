
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        // Return the total of two marks

        return first + second;

    }

    int getTotal(int first, int second, int third) {

// Return the total of three marks
        return first + second + third;

    }

}

public class CalcApp2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ResultCalculator r = new ResultCalculator();

        int first = scanner.nextInt();

        int second = scanner.nextInt();

        int third = scanner.nextInt();

        System.out.println("Two-Mark Total: " + r.getTotal(first, second));

        System.out.println("Three-Mark Total: " + r.getTotal(first, second, third));

    }
}
