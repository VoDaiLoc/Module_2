import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) Math.floor(Math.random() * (100000 - 1) + 1);
            numbers[i] = random;
        }
        LocalTime start = LocalTime.now();
        InterchangeSort(numbers);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start,end);
        int time = sw.getElapsedTime();
        System.out.printf("Thời gian để sort xong mảng là: %d milisecond", time);
    }
    public static void InterchangeSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}