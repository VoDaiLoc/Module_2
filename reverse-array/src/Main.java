import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d of array: ", i);
             int number = input.nextInt();
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        System.out.printf("arr is: %s", Arrays.toString(arr));
        System.out.println();
        System.out.printf("arr revers is: %s", Arrays.toString(newArr));
    }
}