import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        do {
            System.out.println("Nhập số dòng( phải lớn hơn 0 và bằng số cột) của ma trận vuông: ");
            n = input.nextInt();
            System.out.println("Nhập số cột( phải lớn hơn 0 và bằng số dòng) của ma trận vuông: ");
            m = input.nextInt();
        } while (n < 1 || m < 1 ||n!=m);
        float[][] arr = new float[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập phần tử thứ: [%d,%d]: ", i, j);
                arr[i][j] = input.nextFloat();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
        float sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j)
                sum+= arr[i][j];
            }
        }
        System.out.printf("Tổng các giá trị ở đường chéo chính của ma trậnlà: %f", sum);
    }
}