package statuspattern.printer;

import statuspattern.status.MachineStatus;
import statuspattern.validator.machinestatus.MachineStatusValidator;

public interface GumballMachinePrinter {

    void insertGumGuide();
    void inputInsertQuarterGuide();
    void inputEjectQuarterGuide();
    void inputTurnCrankGuide();
    void printInsertQuarterStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator);
    void printEjectStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator);
    void printTurnCrankStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator);
    void printDispenseStatus(MachineStatus machineStatus, MachineStatusValidator machineStatusValidator);
}
