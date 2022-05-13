import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Loc", "Trung", "Tri", "Phuoc", "Tien", "Luong"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].toLowerCase().equals(name.toLowerCase())) {
                check = true;
                index = i;
                break;
            }
        }
        if (check)
            System.out.printf("index of %s in students is: %d", name, index);
        else
            System.out.printf("not found");
    }
}