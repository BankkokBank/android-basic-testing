package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Validation.EmailValidation;

import static junit.framework.Assert.assertTrue;

public class EmailValidationPassTest {
    @Test
    public void อีเเมลแพทเทริน(){
        EmailValidation validation = new EmailValidation();
        assertTrue(validation.emailValidation("nuttawat@gmail.com"));
    }
}
