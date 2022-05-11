import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        month = scanner.nextByte();
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + "có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + "có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + "có 31 ngày");
                break;
            default:
                System.out.println("Dữ liệu sai, vui lòng nhập lại");
        }

    }
}