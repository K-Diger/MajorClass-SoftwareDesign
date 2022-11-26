package statuspattern;

import statuspattern.in.GumballMachine;

public class Application {

    private static final ApplicationContextFactory applicationContextFactory = new ApplicationContextFactory();
    private static final GumballMachine gumballMachine = applicationContextFactory.getGumballMachine();

    public static void main(String[] args) {
        try {
            gumballMachine.run();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
