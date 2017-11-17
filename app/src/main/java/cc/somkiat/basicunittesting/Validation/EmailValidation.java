package cc.somkiat.basicunittesting.Validation;


import java.util.ArrayList;
import java.util.List;

public class EmailValidation {
    String text;
    public boolean emailValidation(String error){
        List<ValidateRule> validateRules = new ArrayList<ValidateRule>();
        validateRules.add(new EmailNullRule());
        validateRules.add(new EmailEmptyRule());
        validateRules.add(new EmailFormatRule());
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
