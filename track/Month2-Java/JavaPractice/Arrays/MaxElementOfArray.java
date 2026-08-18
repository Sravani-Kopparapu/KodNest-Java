
import java.util.Scanner;

class MaxElementOfArray {

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
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max Element is: " + max);
    }
}
