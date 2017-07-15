package calculator;

import java.util.Stack;

public class ReversePolishNotation {

    private ExpressionSplitter splitter;
    private Solver solver;

    private Stack<Operator> stack = new Stack();

    public ReversePolishNotation(ExpressionSplitter splitter, Solver solver) {
        this.splitter = splitter;
        this.solver = solver;
    }

    public void solve() {
        int bracketPriority = 0;
        while (true) {

            String element = splitter.getNextElement();
            if (element == null) {
                break;
            }

            if (isNumber(element)) {
                solver.push(element);
                continue;
            }

            int operatorPriority = bracketPriority;
            switch (element.charAt(0)) {
                case '(':
                    bracketPriority += 10;
                    break;
                case ')':
                    bracketPriority -= 10;
                    break;
                case '+':
                    operatorPriority += 1;
                    break;
                case '-':
                    operatorPriority += 1;
                    break;
                case '*':
                    operatorPriority += 2;
                    break;
                case '/':
                    operatorPriority += 2;
                    break;
                case '^':
                    operatorPriority += 3;
                    break;
            }

            if(element.charAt(0) == '(' || element.charAt(0) == ')')
                continue;
            
            while (true) {
                if (stack.empty()) {
                    stack.push(new Operator(operatorPriority, element.charAt(0)));
                    break;
                }

                Operator operator = stack.peek();
                if (operator.priority < operatorPriority) {
                    stack.push(new Operator(operatorPriority, element.charAt(0)));
                    break;
                }

                solver.push(operator.operator.toString());
                stack.pop();
            }
        }
        
        while (!stack.empty()){
            Operator operator = stack.pop();
            solver.push(operator.operator.toString());
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
