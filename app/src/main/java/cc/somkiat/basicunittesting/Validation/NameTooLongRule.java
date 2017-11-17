package cc.somkiat.basicunittesting.Validation;



public class NameTooLongRule implements ValidateRule {
    String text;

    @Override
    public void validate(String error) {
        if (error.length() > 20){
            text = "Name Is Too Long";
        }
    }

    @Override
    public String getError() {
        return text;
    }
}
