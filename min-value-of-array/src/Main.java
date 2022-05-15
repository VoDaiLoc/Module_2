public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int min = numbers[0];
        for (int i = 0;i< args.length;i++) {
            if (min>numbers[i])
                min = numbers[i];
        }
        System.out.printf("Giá trị nhỏ nhất của mảng là: %d", min);
    }
}