public class Main {
    public static void main(String[] args) {
        int number = 1;
        while (number < 100) {
            if (number >= 2) {
                int i = 2;
                boolean check = true;
                if (i < number) {
                    for (i = 2; i < number; i++) {
                        if (number % i == 0) {
                            check = false;
                            break;
                        }
                    }
                }
                if (check) {
                    System.out.printf(number + " ");
                }
            }
            number++;
        }
    }
}