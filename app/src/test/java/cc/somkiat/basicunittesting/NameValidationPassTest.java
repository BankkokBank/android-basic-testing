package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Validation.NameValidation;

import static org.junit.Assert.assertTrue;

public class NameValidationPassTest {
    @Test
    public void ชื่อถูกต้อง(){
        NameValidation validation = new NameValidation();
        assertTrue(validation.nameValidation("BankkokBank"));
    }
}
