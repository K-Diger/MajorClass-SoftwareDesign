package statuspattern.printer;

import statuspattern.status.MachineStatus;
import statuspattern.validator.machinestatus.MachineStatusValidator;

import java.util.Arrays;
import java.util.Objects;

public class GumballMachineDispensePrinterImpl implements GumballMachinePrinter {

    @Override
    public void insertGumGuide() {
    }

    @Override
    public void inputInsertQuarterGuide() {
    }

    @Override
    public void inputEjectQuarterGuide() {
    }

    @Override
    public void inputTurnCrankGuide() {
    }

    @Override
    public void printInsertQuarterStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printEjectStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printTurnCrankStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printDispenseStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
        String[] log = new String[4];
        log[0] = machineStatusValidator.hasQuarter(machineStatus);
        log[1] = machineStatusValidator.noQuarter(machineStatus);
        log[2] = machineStatusValidator.sold(machineStatus);
        log[3] = machineStatusValidator.isSoldOut(machineStatus);

        Arrays.stream(log)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
