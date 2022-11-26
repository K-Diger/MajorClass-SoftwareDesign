package statuspattern.status;

public enum MachineStatusMessage {
    INSERT_SOLD_OUT(1, "[ERROR] 매진되었습니다. 다음 기회에 이용해 주세요"),
    INSERT_NO_QUARTER(2, "[SUCCESS] 동전이 투입되었습니다."),
    INSERT_HAS_QUARTER(3, "[ERROR] 동전은 한 개만 넣어주세요."),
    INSERT_SOLD(4, "알맹이를 내보내고 있습니다."),

    EJECT_SOLD_OUT(5, "[ERROR] 동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다."),
    EJECT_NO_QUARTER(6, "[ERROR] 동전을 넣어주세요"),
    EJECT_HAS_QUARTER(7, "[SUCCESS] 동전이 반환됩니다."),
    EJECT_SOLD(8, "[ERROR] 이미 알맹이를 뽑으셨습니다."),

    TURN_CRANK_SOLD_OUT(9, "[ERROR] 매진되었습니다."),
    TURN_CRANK_NO_QUARTER(10, "[ERROR] 동전을 넣어 주세요."),
    TURN_CRANK_HAS_QUARTER(11, "[SUCCESS] 손잡이를 돌리셨습니다."),
    TURN_CRANK_SOLD(12, "[ERROR] 손잡이는 한 번만 돌려 주세요."),

    DISPENSE_SOLD_OUT(13, "[ERROR] 매진입니다."),
    DISPENSE_NO_QUARTER(14, "[ERROR] 동전을 넣어주세요"),
    DISPENSE_HAS_QUARTER(15, "[ERROR] 동전은 한 개만 넣어주세요."),
    DISPENSE_SOLD(16, "[SUCCESS] 알맹이를 내보내고 있습니다."),
    ;

    private final int statusValue;
    private final String statusMessage;

    MachineStatusMessage(int statusValue, String statusMessage) {
        this.statusValue = statusValue;
        this.statusMessage = statusMessage;
    }

    public String getMessage() {
        return statusMessage;
    }

    public String getMessageByStatusValue(int statusValue) {
        return String.valueOf(valueOf(String.valueOf(statusValue)));
    }
}
