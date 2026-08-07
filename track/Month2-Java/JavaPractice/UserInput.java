
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Byte Value: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is : " + a);

        System.out.println("Enter Short Value: ");
        short b = sc.nextShort();
        System.out.println("Short value is : " + b);

        System.out.println("Enter Integer Value: ");
        int c = sc.nextInt();
        System.out.println("Integer value is :" + c);

        System.out.println("Enter Float Value: ");
        float d = sc.nextFloat();
        System.out.println("Float value is : " + d);

        System.out.println("Enter Double Value: ");
        double e = sc.nextDouble();
        System.out.println("Double Value is : " + e);

        System.out.println("Enter Long Value: ");
        long f = sc.nextLong();
        System.out.println("Long value is : " + f);

        System.out.println("Enter Boolean Value: ");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean value is :" + g);

    }
}
