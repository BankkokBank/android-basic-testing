package cc.somkiat.basicunittesting.Validation;


public interface ValidateRule {
    void validate(String error);
    String getError();
}
