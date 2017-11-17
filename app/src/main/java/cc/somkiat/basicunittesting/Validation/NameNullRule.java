package cc.somkiat.basicunittesting.Validation;



public class NameNullRule implements ValidateRule {
    String text;
    @Override
    public void validate(String error) {
        if (error == null){
            text = "Name Is NULL";
        }
    }

    @Override
    public String getError() {
        return text;
    }
}
