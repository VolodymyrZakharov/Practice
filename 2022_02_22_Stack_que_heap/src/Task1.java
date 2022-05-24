import java.util.Stack;

public class Task1 {
    /**
     * Метод принимает массив состоящий из трех видов скобок () [] {}. Нужно определить является ли порядок скобок в массие корректным.
     *
     * @param brackets
     * @return
     */
    public static boolean areBracketsCorrect(char[] brackets) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.add(bracket);
            }
        }

        for (char bracket : brackets) {
            if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (bracket == ')' && stack.size() != 0 && stack.lastElement() == '(') {
                    stack.remove(stack.lastElement());
                } else if (bracket == ']' && stack.size() != 0 && stack.lastElement() == '[') {
                    stack.remove(stack.lastElement());
                } else if (bracket == '}' && stack.size() != 0 && stack.lastElement() == '{') {
                    stack.remove(stack.lastElement());
                } else return false;
            }
        }
        return stack.size() == 0;
    }
}
