package cc.somkiat.basicunittesting.Validation;

/**
 * Created by Bankkok_Bank on 16/11/2560.
 */

public class EmailNullRule implements ValidateRule {
    String text;

    @Override
    public void validate(String error) {
        if (error == null){
            text = "Email Is Null";
        }
    }

    @Override
    public String getError() {
        return text;
    }
}
