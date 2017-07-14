package calculator;

public class ExpressionSplitter {

    String expression;
    int position = 0;

    public ExpressionSplitter(String expression) {
        this.expression = expression;
    }

    public String getNextElement() {
        if (position >= expression.length()) {
            return null;
        }

        Character character = expression.charAt(position++);

        if (!isNumber(character)) {
            return character.toString();
        }

        String number = character.toString();

        while (position < expression.length()) {
            character = expression.charAt(position);
            if (isNumber(character) == true) {
                number = number + character.toString();
                position++;
            } else {
                break;
            }
        }

        return number;
    }

    private boolean isNumber(Character character) {
        if ((character >= '0' && character <= '9') || character == '.') {
            return true;
        } else {
            return false;
        }
    }

}
