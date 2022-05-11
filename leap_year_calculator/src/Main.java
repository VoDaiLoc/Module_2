import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra:");
        year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}