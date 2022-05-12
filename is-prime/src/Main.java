import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter n, enter 0 to end: ");
            number = scanner.nextInt();
            if (number < 2) {
                System.out.printf("%d is not prime \n", number);
            } else {
                boolean check = true;
                for (int i = 2; i < number; i++) {
                    if (i < number) {
                        if (number % i == 0) {
                            check = false;
                        }
                    }
                }
                if (check) {
                    System.out.printf("%d is a prime \n", number);
                } else {
                    System.out.printf("%d is not a prime \n", number);
                }
            }
        } while (number != 0);
    }
}