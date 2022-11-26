package statuspattern.validator.machinestatus;

import statuspattern.status.MachineStatus;

import static statuspattern.status.MachineStatusMessage.*;

public class MachineDispenseStatusValidatorImpl implements MachineStatusValidator {

    @Override
    public String isSoldOut(MachineStatus machineStatus) {
        if (machineStatus.getGumCount() == 0) {
            return DISPENSE_SOLD_OUT.getMessage();
        }
        return "";
    }

    @Override
    public String noQuarter(MachineStatus machineStatus) {
        if (!machineStatus.getQuarter()) {
            return DISPENSE_NO_QUARTER.getMessage();
        }
        return "";
    }

    @Override
    public String hasQuarter(MachineStatus machineStatus) {
        if (machineStatus.getQuarter() && false) {
            return DISPENSE_HAS_QUARTER.getMessage();
        }
        return "";
    }

    @Override
    public String sold(MachineStatus machineStatus) {
        if (machineStatus.getQuarter() && machineStatus.getGumCount() != 0) {
            return DISPENSE_SOLD.getMessage();
        }
        return "";
    }
}
