import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        int common = 0;
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                common = i;
            }
        }
        System.out.println("Greatest common factor: " + common);
    }
}