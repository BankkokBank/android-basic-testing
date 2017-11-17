package cc.somkiat.basicunittesting.Validation;

/**
 * Created by Bankkok_Bank on 16/11/2560.
 */

public class EmailEmptyRule implements ValidateRule {

    String text;

    @Override
    public void validate(String error) {
        if (error.isEmpty()){
            text = "Email Is Empty";
        }
    }

    @Override
    public String getError() {
        return text;
    }
}
