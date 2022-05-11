import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int S = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            S += i * (i + 1);
        }
        System.out.println("Giá trị của biểu thức S = " + S);
    }
}