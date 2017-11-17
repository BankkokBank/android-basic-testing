package cc.somkiat.basicunittesting.Validation;


public class NameEmptyRule implements ValidateRule {
    String text;
    @Override
    public void validate(String error) {
        if (error.equals("")){
            text = "Name Is Empty";
        }
    }

    @Override
    public String getError() {
        return text;
    }

}
