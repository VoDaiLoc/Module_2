import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckBracketsStack check = new CheckBracketsStack();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào 1 chuỗi : ");
//        String s = input.nextLine();
        String s = "{s * (s – a) * [(s – b) * (s – c)]} ";
//        System.out.println(check.checkBrackets(s));
        CheckBonus test = new CheckBonus();
        System.out.println(test.check(s));
    }
}