import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số nguyên (0 <= number < 1000): ");
            number = scanner.nextInt();
            while (number >= 0 && number < 1000) {
                int first = number / 100;
                int second = (number % 100) / 10;
                int third = number % 10;
                if (number < 10) {
                    String result = zeroToNine(number);
                    System.out.println(result);
                } else if (number < 20) {
                    String result = _10_to_19(third);
                    System.out.println(result);
                } else if (number < 100) {
                    if (third != 0) {
                        String result = _20_to_99(second) + " " + zeroToNine(third);
                        System.out.println(result);
                    } else {
                        String result = _20_to_99(second);
                        System.out.println(result);
                    }
                } else {
                    if (number % 100 < 10) {
                        if (number % 100 == 0) {
                            String result = zeroToNine(first) + " hundred";
                            System.out.println(result);
                        } else {
                            String result = zeroToNine(first) + " hundred and " + zeroToNine(third);
                            System.out.println(result);
                        }
                    } else if (number % 100 < 20) {
                        String result = zeroToNine(first) + " hundred and " + _10_to_19(third);
                        System.out.println(result);
                    } else if (number % 100 < 100) {
                        if (third != 0) {
                            String result = zeroToNine(first) + " hundred and " + _20_to_99(second) + " " + zeroToNine(third);
                            System.out.println(result);
                        } else {
                            String result = zeroToNine(first) + " hundred and " + _20_to_99(second);
                            System.out.println(result);
                        }
                    }
                }
                System.out.println("Nhập vào số nguyên (0 <= number < 1000): ");
                number = scanner.nextInt();
            }
        } while (number < 0 || number >= 1000);
    }

    public static String zeroToNine(int number) {
        String read = null;
        switch (number) {
            case 0:
                read = "zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nine";
                break;
        }
        return read;
    }

    public static String _10_to_19(int number) {
        String read = null;
        switch (number) {
            case 0:
                read = "ten";
                break;
            case 1:
                read = "eleven";
                break;
            case 2:
                read = "twelwe";
            case 3:
                read = "thirteen";
                break;
            case 4:
                read = "fourteen";
                break;
            case 5:
                read = "fifteen";
                break;
            case 6:
                read = "sixteen";
                break;
            case 7:
                read = "seventeen";
                break;
            case 8:
                read = "eighteen";
                break;
            case 9:
                read = "nineteen";
                break;
        }
        return read;
    }

    public static String _20_to_99(int number) {
        String read = null;
        switch (number) {
            case 2:
                read = "twenty";
                break;
            case 3:
                read = "thirty";
                break;
            case 4:
                read = "fourty";
                break;
            case 5:
                read = "fifty";
                break;
            case 6:
                read = "sixty";
                break;
            case 7:
                read = "seventy";
                break;
            case 8:
                read = "eighty";
                break;
            case 9:
                read = "ninety";
                break;
        }
        return read;
    }
}