import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        a = scanner.nextFloat();
        System.out.println("Nhập vào b: ");
        b = scanner.nextFloat();
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            System.out.println("Phương trình có nghiệm duy nhất x = " +(-b)/a);
        }
    }
}