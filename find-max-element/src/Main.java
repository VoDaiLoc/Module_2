import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        int[] assets = new int[size];
        for (int i = 0; i < assets.length; i++) {
            System.out.printf("Enter element %d in assets: ", i);
            int asset = input.nextInt();
            assets[i] = asset;
        }
        int max = assets[0];
        int index = -1;
        for (int i = 1; i < assets.length; i++) {
            if (max < assets[i]) {
                max = assets[i];
                index = i;
            }
        }
        System.out.printf("Max value in assets is: %d index: %d", max, index);
    }
}