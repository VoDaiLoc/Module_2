import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a element: ");
        int element = input.nextInt();
        int indexDel = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                indexDel = i;
            }
        }
        if (indexDel != -1) {
            for (int i = indexDel; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < arr.length-1; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        System.out.printf("Array affter deleting %s \n", Arrays.toString(arr));
    }
}