package calculator;

import java.util.Scanner;

public class ExpressionInput {

    private Scanner scanner = new Scanner(System.in);

    public String getCommand() {
        return scanner.nextLine();
    }

}
