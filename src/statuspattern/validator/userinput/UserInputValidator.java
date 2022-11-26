package statuspattern.validator.userinput;

public interface UserInputValidator {

    int validateGumCountInput(String input);

    void validateInputQuarter(String input);

    void validateInputEjectQuarter(String input);

    void validateInputTurnCrank(String input);
}
