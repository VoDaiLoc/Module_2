import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào Weight: ");
        weight = scanner.nextFloat();
        System.out.println("Nhập vào height: ");
        height = scanner.nextFloat();
        bmi = weight * height;
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi <30) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}