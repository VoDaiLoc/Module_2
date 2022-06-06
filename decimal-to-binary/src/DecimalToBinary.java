import java.util.Stack;

public class DecimalToBinary {
    public String convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int divison2 = number % 2;
            stack.push(divison2);
            number /= 2;
        }
        String result = "";
        while (!stack.empty()) {
            result += stack.pop();
        }
        return result;
    }
}
