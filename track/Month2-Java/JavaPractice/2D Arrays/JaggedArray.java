
import java.util.Scanner;

class JaggedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];
        System.out.println("Enter array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
