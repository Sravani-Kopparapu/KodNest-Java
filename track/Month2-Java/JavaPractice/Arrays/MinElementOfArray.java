
import java.util.Scanner;

class MinElementOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int min = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum Element of Array is: " + min);
    }
}
