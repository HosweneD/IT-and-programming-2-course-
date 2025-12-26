import java.util.Scanner;
import java.util.Stack;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        boolean result = checkFormula(input);
        System.out.println(result);
    }

    private static boolean checkFormula(String s) {
        String[] parts = s.split("=");

        int[] values = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            values[i] = evaluate(parts[i].trim());
        }

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] != values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static int evaluate(String expression) {

        expression = expression.replaceAll(" ", "");

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expression.length()) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                numbers.push(num);
                continue;
            } else {
                while (!operators.isEmpty() && hasPrecedence(c) <= hasPrecedence(operators.peek())) {
                    applyOperation(numbers, operators.pop());
                }
                operators.push(c);
                i++;
            }
        }

        while (!operators.isEmpty()) {
            applyOperation(numbers, operators.pop());
        }

        return numbers.pop();
    }

    private static int hasPrecedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    private static void applyOperation(Stack<Integer> numbers, char op) {
        int b = numbers.pop();
        int a = numbers.pop();

        switch (op) {
            case '+':
                numbers.push(a + b);
                break;
            case '-':
                numbers.push(a - b);
                break;
            case '*':
                numbers.push(a * b);
                break;
            case '/':
                numbers.push(a / b);
                break;
        }
    }
}