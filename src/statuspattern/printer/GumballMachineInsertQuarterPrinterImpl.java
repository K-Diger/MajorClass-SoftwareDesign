package statuspattern.printer;

import statuspattern.status.MachineStatus;
import statuspattern.validator.machinestatus.MachineStatusValidator;

import static statuspattern.status.MachineStatusMessage.INSERT_NO_QUARTER;

public class GumballMachineInsertQuarterPrinterImpl implements GumballMachinePrinter {

    @Override
    public void insertGumGuide() {
    }

    @Override
    public void inputInsertQuarterGuide() {
        System.out.println("\n동전 넣기 : O, 동전 넣지 않기 : X 둘 중 하나의 커맨드를 입력하세요.");
    }

    @Override
    public void inputEjectQuarterGuide() {
    }

    @Override
    public void inputTurnCrankGuide() {
    }

    @Override
    public void printInsertQuarterStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
        if (machineStatus.getQuarter()) {
            System.out.println(INSERT_NO_QUARTER.getMessage());
            return;
        }
        throw new IllegalArgumentException("종료");
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
