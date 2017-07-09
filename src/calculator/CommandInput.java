package calculator;

import java.util.Scanner;

public class CommandInput {

    private Scanner scanner = new Scanner(System.in);

    public String getCommand() {
        return scanner.nextLine();
    }

}
