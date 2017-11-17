package cc.somkiat.basicunittesting.Validation;

public class NameFormatRule implements ValidateRule {

    String text;

    @Override
    public void validate(String error) {
        if (!error.matches("[a-zA-Z]+"))
        text = "Name Is Not Alphabet";
    }

    @Override
    public String getError() {

        return text;
    }
}
