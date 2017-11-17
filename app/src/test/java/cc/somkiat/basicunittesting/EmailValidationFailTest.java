package cc.somkiat.basicunittesting;


import org.junit.Test;

import cc.somkiat.basicunittesting.Validation.EmailValidation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmailValidationFailTest {

    @Test
    public void อีเมลเป็นค่าnull() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.emailValidation(null);
        assertFalse("ไม่ผ่านมีค่า NULL", result);
        assertEquals("Email Is Null", validation.getText());
    }

    @Test
    public void อีเมลเป็นค่าว่าง() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.emailValidation("");
        assertFalse("ไม่ผ่านมีค่าว่าง", result);
        assertEquals("Email Is Empty", validation.getText());
    }

    @Test
    public void ไม่ใช่อีเมลแพทเทริน() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.emailValidation("bank");
        assertFalse("ไม่ผ่านมีค่าว่าง", result);
        assertEquals("Email Is Invalid", validation.getText());
    }
}