package calculator;

public class ReversePolishNotation {

    private ExpressionSplitter splitter;
    private Solver solver;

    public ReversePolishNotation(ExpressionSplitter splitter, Solver solver) {
        this.splitter = splitter;
        this.solver = solver;
    }

    public void solve() {
        while (true) {

            String element = splitter.getNextElement();
            if (element == null) {
                break;
            }
            
            // ...

            solver.push(element);
        }
    }

}
