package cc.somkiat.basicunittesting.Validation;


public class NameTooShortRule implements ValidateRule {

    String text;

    @Override
    public void validate(String error) {
        if (error.length() < 2 ){
            text = "Name Is Too Short";
        }
    }

    @Override
    public String getError() {
        return text;
    }
}
