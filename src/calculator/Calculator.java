package calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator version 1.0");

        CommandInput input = new CommandInput();
        while (true) {

            System.out.print(": ");
            String command = input.getCommand();

            if (command.equalsIgnoreCase("quit") || command.equalsIgnoreCase("exit")) {
                System.out.println("bye bye!");
                break;
            }

            System.out.println("Entered: " + command);
        }

    }

}
