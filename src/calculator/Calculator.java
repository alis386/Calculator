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

            ExpressionSplitter splitter = new ExpressionSplitter(expression);
            double result = Double.parseDouble(splitter.getElement());
            while (true) {
                String operator = splitter.getElement();
                String value = splitter.getElement();

                if (operator == null || value == null) {
                    break;
                }

                switch (operator) {
                    case "*":
                        result = result * Double.parseDouble(value);
                        break;
                    case "/":
                        result = result / Double.parseDouble(value);
                        break;
                    case "+":
                        result = result + Double.parseDouble(value);
                        break;
                    case "-":
                        result = result - Double.parseDouble(value);
                        break;
                    
                }
            }

            System.out.println(result);
        }

    }

}
