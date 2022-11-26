package statuspattern;

import statuspattern.in.GumballMachine;
import statuspattern.input.UserInputer;
import statuspattern.input.UserInputerImpl;
import statuspattern.printer.*;
import statuspattern.validator.machinestatus.*;
import statuspattern.validator.userinput.UserInputValidator;
import statuspattern.validator.userinput.UserInputValidatorImpl;

public class ApplicationContextFactory {

    public MachineStatusValidator getGumballMachineInsertQuarterStatusValidator() {
        return new MachineInsertQuarterStatusValidatorImpl();
    }

    public MachineStatusValidator getGumballMachineEjectStatusValidator() {
        return new MachineEjectStatusValidatorImpl();
    }

    public MachineStatusValidator getGumballMachineTurnCrankStatusValidator() {
        return new MachineTurnCrankStatusValidatorImpl();
    }

    public MachineStatusValidator getGumballMachineDispenseStatusValidator() {
        return new MachineDispenseStatusValidatorImpl();
    }

    public GumballMachinePrinter getGumballMachineInitPrinter() {
        return new GumballMachineInitPrinterImpl();
    }

    public GumballMachinePrinter getGumballMachineInsertQuarterPrinter() {
        return new GumballMachineInsertQuarterPrinterImpl();
    }

    public GumballMachinePrinter getGumballMachineEjectQuarterPrinter() {
        return new GumballMachineEjectQuarterPrinterImpl();
    }

    public GumballMachinePrinter getGumballMachineTurnCrankPrinter() {
        return new GumballMachineTurnCrankPrinterImpl();
    }

    public GumballMachinePrinter getGumballMachineDispensePrinter() {
        return new GumballMachineDispensePrinterImpl();
    }

    public UserInputer getUserInputer() {
        return new UserInputerImpl();
    }

    public UserInputValidator getUserInputValidator() {
        return new UserInputValidatorImpl();
    }

    public GumballMachine getGumballMachine() {
        return new GumballMachine(this, getUserInputer(), getUserInputValidator());
    }
}
