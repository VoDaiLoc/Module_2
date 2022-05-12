import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        System.out.println("Enter your name: ");
        fullName = scanner.nextLine();
        System.out.printf("Hello: %s", fullName);
    }
}