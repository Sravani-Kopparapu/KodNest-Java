
import java.util.Scanner;

public class ReadingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        char ch = sc.next().charAt(1);
        System.out.println("Char value is : " + ch);
    }
}
