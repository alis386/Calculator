package calculator;

import java.util.Stack;

public class Solver {

    private Stack<Double> stack = new Stack();

    public void push(String element) {
        if (isNumber(element)) {
            stack.push(Double.parseDouble(element));
            return;
        }

        double second = stack.pop();
        double first = stack.pop();
        double result = 0;

        switch (element.charAt(0)) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '^':
                result = Math.pow(first, second);
                break;
        }

        stack.push(result);
    }

    public double getResult() {
        if (stack.empty()) {
            return 0;
        } else {
            return stack.peek();
        }
    }

    private boolean isNumber(String element) {
        try {
            Double.parseDouble(element);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
