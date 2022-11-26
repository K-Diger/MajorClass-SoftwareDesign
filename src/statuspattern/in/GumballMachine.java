package statuspattern.in;

import statuspattern.ApplicationContextFactory;
import statuspattern.input.UserInputer;
import statuspattern.printer.GumballMachinePrinter;
import statuspattern.status.MachineStatus;
import statuspattern.validator.machinestatus.MachineStatusValidator;
import statuspattern.validator.userinput.UserInputValidator;


public class GumballMachine {

    private final ApplicationContextFactory applicationContextFactory;
    private final MachineStatus machineStatus = MachineStatus.getInstance();
    private GumballMachinePrinter gumballMachinePrinter;
    private MachineStatusValidator machineStatusValidator;
    private final UserInputer userInputer;
    private final UserInputValidator userInputValidator;

    public GumballMachine(
            ApplicationContextFactory applicationContextFactory,
            UserInputer userInputer,
            UserInputValidator userInputValidator) {

        this.applicationContextFactory = applicationContextFactory;
        this.userInputer = userInputer;
        this.userInputValidator = userInputValidator;
    }

    private boolean inputConvert(String input) {
        return input.equals("O");
    }

    private void initMachine() {
        gumballMachinePrinter = applicationContextFactory.getGumballMachineInitPrinter();
        gumballMachinePrinter.insertGumGuide();

        machineStatus.setGumCount(userInputValidator.validateGumCountInput(String.valueOf(userInputer.initGumCount())));
    }

    private void insertQuarter() {
        gumballMachinePrinter = applicationContextFactory.getGumballMachineInsertQuarterPrinter();
        machineStatusValidator = applicationContextFactory.getGumballMachineInsertQuarterStatusValidator();
        gumballMachinePrinter.inputInsertQuarterGuide();

        String input = userInputer.inputInsertQuarter();
        userInputValidator.validateInputQuarter(input);

        if (inputConvert(input)) {
            machineStatus.cognizeQuaterIngoing();
        }

        gumballMachinePrinter.printInsertQuarterStatus(machineStatus, machineStatusValidator);
    }

    private void ejectQuarter() {
        gumballMachinePrinter = applicationContextFactory.getGumballMachineEjectQuarterPrinter();
        machineStatusValidator = applicationContextFactory.getGumballMachineEjectStatusValidator();
        gumballMachinePrinter.inputEjectQuarterGuide();

        String input = userInputer.inputEjectQuarter();
        userInputValidator.validateInputEjectQuarter(input);

        if (inputConvert(input)) {
            machineStatus.setEndFlag(true);
        }

        gumballMachinePrinter.printEjectStatus(machineStatus, machineStatusValidator);
    }

    private void turnCrank() {
        gumballMachinePrinter = applicationContextFactory.getGumballMachineTurnCrankPrinter();
        machineStatusValidator = applicationContextFactory.getGumballMachineTurnCrankStatusValidator();
        gumballMachinePrinter.inputTurnCrankGuide();

        String input = userInputer.inputTurnCrank();
        userInputValidator.validateInputTurnCrank(input);

        if (machineStatus.remainedGum() && inputConvert(input)) {
            machineStatus.setGumCount(machineStatus.getGumCount() - 1);
            machineStatus.setEndFlag(true);
            gumballMachinePrinter.printTurnCrankStatus(machineStatus, machineStatusValidator);
        }
    }

    private void dispense() {
        gumballMachinePrinter = applicationContextFactory.getGumballMachineDispensePrinter();
        machineStatusValidator = applicationContextFactory.getGumballMachineDispenseStatusValidator();

        gumballMachinePrinter.printDispenseStatus(machineStatus, machineStatusValidator);
    }

    public void run() {
        initMachine();
        insertQuarter();
        ejectQuarter();
        if (machineStatus.getEndFlag()) {
            return;
        }
        turnCrank();
        if (machineStatus.getEndFlag()) {
            return;
        }
        dispense();
    }
}
