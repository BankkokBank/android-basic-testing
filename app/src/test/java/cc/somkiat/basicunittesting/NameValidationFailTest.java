package cc.somkiat.basicunittesting;


import org.junit.Test;

import cc.somkiat.basicunittesting.Validation.NameValidation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง() {
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("");
        assertFalse("ไม่ผ่านมีค่าว่าง",result);
        assertEquals("Name Is Empty", validation.getText());
    }

    @Test
    public void ชื่อเป็นค่าNULL() {
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation(null);
        assertFalse("ไม่ผ่านมีค่า NULL",result);
        assertEquals("Name Is NULL", validation.getText());
    }

    @Test
    public void ชื่อน้อยกว่า2ตัวอักษร() {
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("a");
        assertFalse("ไม่่ผ่านตัวอักษรน้อยกว่า 2 ตัวอักษร", result);
        assertEquals("Name Is Too Short", validation.getText());

    }

    @Test
    public void ชื่อมากกว่า21ตัวอักษร() {
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("bbbbbbbbbbbbbbbbbbbbbb");
        assertFalse("ไม่่ผ่านตัวอักษรมากกว่า 20 ตัวอักษร", result);
        assertEquals("Name Is Too Long", validation.getText());

    }

    @Test
    public void ชื่อเป็นตัวเลข() {
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("123456");
        assertFalse("ไม่ผ่านเพราะเป็นตัวเลข", result);
        assertEquals("Name Is Not Alphabet", validation.getText());
    }
    @Test
    public void ชื่อเป็นอักขระพิเศษ() {
        NameValidation validation = new NameValidation();
        boolean result = validation.nameValidation("@()+-");
        assertFalse("ไม่ผ่านเพราะเป็นอักขระพิเศษ", result);
        assertEquals("Name Is Not Alphabet", validation.getText());
    }

}
