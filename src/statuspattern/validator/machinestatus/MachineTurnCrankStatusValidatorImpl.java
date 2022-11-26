package statuspattern.validator.machinestatus;

import statuspattern.status.MachineStatus;

import static statuspattern.status.MachineStatusMessage.*;


public class MachineTurnCrankStatusValidatorImpl implements MachineStatusValidator {

    @Override
    public String isSoldOut(MachineStatus machineStatus) {
        if (machineStatus.getGumCount() == 0) {
            return TURN_CRANK_SOLD_OUT.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }

    @Override
    public String noQuarter(MachineStatus machineStatus) {
        if (!machineStatus.getQuarter()) {
            return TURN_CRANK_NO_QUARTER.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }

    @Override
    public String hasQuarter(MachineStatus machineStatus) {
        if (machineStatus.getQuarter()) {
            return TURN_CRANK_HAS_QUARTER.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }

    @Override
    public String sold(MachineStatus machineStatus) {
        if (machineStatus.getQuarter() && machineStatus.getGumCount() != 0) {
            return TURN_CRANK_SOLD.getMessage();
        }
        throw new IllegalArgumentException("[ERROR] 예기치 못한 오류가 발생했습니다.");
    }
}
