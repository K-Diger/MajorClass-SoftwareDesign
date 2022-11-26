package statuspattern.validator.machinestatus;

import statuspattern.status.MachineStatus;

public interface MachineStatusValidator {

    String isSoldOut(MachineStatus machineStatus);

    String noQuarter(MachineStatus machineStatus);

    String hasQuarter(MachineStatus machineStatus);

    String sold(MachineStatus machineStatus);
}
