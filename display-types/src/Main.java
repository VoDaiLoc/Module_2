import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("\t1. Print the rectangle");
            System.out.println("\t2. Print the square triangle");
            System.out.println("\t3. Print isosceles triangle");
            System.out.println("\t4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle:");
                    System.out.println("Enter width: ");
                    int width = input.nextInt();
                    System.out.println("Enter height: ");
                    int height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle:");
                    System.out.println("Enter height: ");
                    int n = input.nextInt();
                    System.out.println("squared angle: botton-left");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println("squared angle: top-left");
                    for (int i = n - 1; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle:");
                    System.out.println("Enter height: ");
                    int h = input.nextInt();
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= h - i; j++) {
                            System.out.printf("   ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.printf(" * ");
                        }
                        for (int j = 1; j <= h - i; j++) {
                            System.out.printf("   ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
    }
}