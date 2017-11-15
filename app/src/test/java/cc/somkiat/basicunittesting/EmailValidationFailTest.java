package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class EmailValidationFailTest {

    @Test
    public void อีเมลเป็นค่าว่าง() {
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmpty("");
        assertFalse("ไม่ผ่าน มีค่าว่าง", result);
    }
}