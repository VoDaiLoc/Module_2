import java.util.Stack;

public class CheckBracketsStack {
    public boolean checkBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    char peek = stack.peek();
                    if (peek == '(') {
                        stack.pop();
                    }
                }
            }
        }
        return stack.empty();
    }
}
