package statuspattern.validator.machinestatus;

import statuspattern.status.MachineStatus;

import static statuspattern.status.MachineStatusMessage.*;

public class MachineEjectStatusValidatorImpl implements MachineStatusValidator {

    @Override
    public String isSoldOut(MachineStatus machineStatus) {
        if (!machineStatus.getQuarter() && machineStatus.cognizeSoldOut()) {
            return EJECT_SOLD_OUT.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }

    @Override
    public String noQuarter(MachineStatus machineStatus) {
        if (!machineStatus.getQuarter() && !machineStatus.cognizeSoldOut()) {
            return EJECT_NO_QUARTER.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }

    @Override
    public String hasQuarter(MachineStatus machineStatus) {
        if (machineStatus.getQuarter()) {
            return EJECT_HAS_QUARTER.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }

    @Override
    public String sold(MachineStatus machineStatus) {
        if (!machineStatus.getQuarter()) {
            return EJECT_SOLD.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }
}
