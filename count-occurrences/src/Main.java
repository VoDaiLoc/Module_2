import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "I love Codegym";
        System.out.println("Nhập vào kí tự cần kiểm tra: ");
        String ch = input.nextLine();
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0;i<str.length();i++) {
            if (str.charAt(i)==ch.charAt(0)) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện của kí tự %s trong chuỗi là: %d", ch,count);
    }
}