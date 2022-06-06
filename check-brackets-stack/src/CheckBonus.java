import java.util.Stack;

public class CheckBonus {
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return false;
                } else {
                    char peek = stack.peek();
                    if ((c == ')' && peek == '(') || (c == ']' && peek == '[') || c == '}' && peek == '{') {
                        stack.pop();
                    }
                }
            }
        }
        return stack.empty();
    }
}
