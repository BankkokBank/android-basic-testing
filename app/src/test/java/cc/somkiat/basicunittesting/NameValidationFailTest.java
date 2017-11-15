package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง() {

        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isEmpty("");
        assertFalse("ต้องไม่ผ่าน เพราะมันมีค่าว่าง !!", result);

    }

    @Test
    public void ชื่อน้อยกว่า2ตัวอักษร() {
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isLowerTwo("a");
        assertFalse("ไม่่ผ่านตัวอักษรน้อยกว่า 2 ตัวอักษร", result);

    }

    @Test
    public void ชื่ิอเกิน20ตัวอักษร() {
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isOverTwenty("abcdefghijklmnopqrstu");
        assertFalse( "ไม่ผ่านตัวอักษรมากกว่า 20 ตัวอักษร", result);

    }
}
