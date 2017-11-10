package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void  ชื่อเป็นค่าว่าง(){

        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isEmpty("");
        assertFalse( "ต้องไม่ผ่าน เพราะมันมีค่าว่าง !!", result);

    }

}
