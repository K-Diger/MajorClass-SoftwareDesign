package statuspattern.printer;

import statuspattern.status.MachineStatus;
import statuspattern.validator.machinestatus.MachineStatusValidator;

public class GumballMachineInitPrinterImpl implements GumballMachinePrinter {

    @Override
    public void insertGumGuide() {
        System.out.println("껌 통에 넣을 껌 갯수를 입력해주세요. (0보다 큰 정수)");
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
    }
}
