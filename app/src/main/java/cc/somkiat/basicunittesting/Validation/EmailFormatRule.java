package cc.somkiat.basicunittesting.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFormatRule implements ValidateRule {
    String text;

    @Override
    public void validate(String error) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(error);
        if (!matcher.matches()) {
            text = "Email Is Invalid";
        }
    }

    @Override
    public String getError() {

        return text;
    }
}
