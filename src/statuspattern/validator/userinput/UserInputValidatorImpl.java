package statuspattern.validator.userinput;

public class UserInputValidatorImpl implements UserInputValidator {

    @Override
    public int validateGumCountInput(String input) {
        try {
            int convertedInput = Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("껌 갯수는 정수여야 합니다.");
        }
        int convertedInput = Integer.parseInt(input);

        if (convertedInput < 1) {
            throw new IllegalArgumentException("껌 갯수는 0보다 커야만 합니다.");
        }
        return convertedInput;
    }

    @Override
    public void validateInputQuarter(String input) {
        if (!input.equals("O") && !input.equals("X")) {
            throw new IllegalArgumentException("동전 넣기 입력 오류");
        }
    }

    @Override
    public void validateInputEjectQuarter(String input) {
        if (!input.equals("O") && !input.equals("X")) {
            throw new IllegalArgumentException("동전 반환 입력 오류");
        }
    }

    @Override
    public void validateInputTurnCrank(String input) {
        if (!input.equals("O") && !input.equals("X")) {
            throw new IllegalArgumentException("레버 돌리기 입력 오류");
        }
    }
}
