package statuspattern.status;

public class MachineStatus {

    private static final MachineStatus machineStatus = new MachineStatus();
    private int gumCount;
    private boolean quarter = false;
    private boolean endFlag = true;

    private MachineStatus() {
    }

    public static MachineStatus getInstance() {
        return machineStatus;
    }

    public MachineStatus cognizeQuaterIngoing() {
        this.quarter = true;
        return this;
    }

    public MachineStatus cognizeQuaterOutgoing() {
        this.quarter = false;
        return this;
    }

    public boolean cognizeSoldOut() {
        if (this.gumCount < 1) {
            return true;
        }
        return false;
    }

    public int getGumCount() {
        return gumCount;
    }

    public void setGumCount(int gumCount) {
        this.gumCount = gumCount;
    }

    public boolean getEndFlag() {
        return this.endFlag;
    }

    public void setEndFlag(boolean endFlag) {
        this.endFlag = endFlag;
    }

    public boolean getQuarter() {
        return this.quarter;
    }

    public boolean remainedGum() {
        return gumCount > 0;
    }
}
