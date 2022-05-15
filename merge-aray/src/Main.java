import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
        int[] arr2 = {10,11,12,13,14};
        int[] arr3 = new int[15];
        for (int i = 0; i<arr1.length;i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i<arr2.length ; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}