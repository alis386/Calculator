package calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator version 1.0");

        ExpressionInput input = new ExpressionInput();
        while (true) {

            System.out.print(": ");
            String expression = input.getCommand();

            if (expression.equalsIgnoreCase("quit") || expression.equalsIgnoreCase("exit")) {
                System.out.println("bye bye!");
                break;
            }

            Solver solver = new Solver();
            ExpressionSplitter splitter = new ExpressionSplitter(expression);
            ReversePolishNotation rpn = new ReversePolishNotation(splitter, solver);

            rpn.solve();
            System.out.println(solver.getResult());
        }
    }

}
