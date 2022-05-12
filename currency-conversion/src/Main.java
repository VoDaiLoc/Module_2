import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float usd;
        System.out.println("Nhập vào số USD muốn đổi: ");
        usd = scanner.nextFloat();
        float vnd = usd * 23000;
        System.out.printf("%.2f USD tương đương với %.2f VND", usd, vnd);
    }
}