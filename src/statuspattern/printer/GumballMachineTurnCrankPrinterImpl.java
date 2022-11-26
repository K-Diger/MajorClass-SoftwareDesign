package statuspattern.printer;

import statuspattern.status.MachineStatus;
import statuspattern.validator.machinestatus.MachineStatusValidator;

public class GumballMachineTurnCrankPrinterImpl implements GumballMachinePrinter {


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
        System.out.println("\n레버 돌리기 : O, 돌리지 않기 : X 를 둘 중 하나의 커맨드를 입력하세요.");
    }

    @Override
    public void printInsertQuarterStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printEjectStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }

    @Override
    public void printTurnCrankStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
        System.out.printf("\n레버를 돌렸습니다. 남은 껌 갯수는 %d개 입니다.", machineStatus.getGumCount());
    }

    @Override
    public void printDispenseStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator) {
    }
}
