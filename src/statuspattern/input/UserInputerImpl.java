package statuspattern.input;

import java.util.Scanner;

public class UserInputerImpl implements UserInputer {

    @Override
    public String initGumCount() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String inputInsertQuarter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String inputEjectQuarter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String inputTurnCrank() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
