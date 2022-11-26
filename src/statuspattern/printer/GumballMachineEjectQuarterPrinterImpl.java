package statuspattern.printer;

import statuspattern.status.MachineStatus;
import statuspattern.status.MachineStatusMessage;
import statuspattern.validator.machinestatus.MachineStatusValidator;

import static statuspattern.status.MachineStatusMessage.EJECT_HAS_QUARTER;

public class GumballMachineEjectQuarterPrinterImpl implements GumballMachinePrinter {

    @Override
    public void insertGumGuide() {

    }

    @Override
    public void inputInsertQuarterGuide() {

    }

    @Override
    public void inputEjectQuarterGuide() {
        System.out.println("\n코인 반환 : O, 코인 반환하지 않기 : X 둘 중 하나의 커맨드를 입력하세요.");
    }

    @Override
    public void inputTurnCrankGuide() {
    }

    @Override
    public void printInsertQuarterStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printEjectStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
        System.out.println(EJECT_HAS_QUARTER.getMessage());
    }

    @Override
    public void printTurnCrankStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printDispenseStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }
}
