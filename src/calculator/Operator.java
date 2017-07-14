package calculator;

public class Operator {

    public int priority;
    public Character operator;

    public Operator(int priority, Character operator) {
        this.priority = priority;
        this.operator = operator;
    }
}
