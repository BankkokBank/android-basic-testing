package cc.somkiat.basicunittesting.Validation;

import java.util.ArrayList;
import java.util.List;

public class NameValidation {
    String text;
    public boolean nameValidation(String error) {
        List<ValidateRule> validateRules = new ArrayList<ValidateRule>();
        validateRules.add(new NameNullRule());
        validateRules.add(new NameEmptyRule());
        validateRules.add(new NameTooShortRule());
        validateRules.add(new NameTooLongRule());
        validateRules.add(new NameFormatRule());
        for (ValidateRule validateRule : validateRules){
            validateRule.validate(error);
            if (validateRule.getError() != null){
                text = validateRule.getError();
                return false;
            }
        }
        return true;
    }

    public String getText(){
        return text;
    }
}
