package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.Validation.EmailValidation;
import cc.somkiat.basicunittesting.Validation.NameValidation;

public class MainActivity extends AppCompatActivity {
    EditText email, name;
    String emailCheck, nameCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.emailInput);
        name = findViewById(R.id.userNameInput);

    }

    public void onSaveClick(View view) {
        EmailValidation emailValidation = new EmailValidation();
        NameValidation nameValidation = new NameValidation();
        emailValidation.emailValidation(email.getText().toString());
        nameValidation.nameValidation(name.getText().toString());
        emailCheck = emailValidation.getText();
        nameCheck = nameValidation.getText();
        if(emailCheck == null && nameCheck == null){
            Toast.makeText(this, "complete!!", Toast.LENGTH_LONG).show();
        } else if (emailCheck == null){
            Toast.makeText(this, nameCheck, Toast.LENGTH_LONG).show();
        } else if (nameCheck == null){
            Toast.makeText(this, emailCheck, Toast.LENGTH_LONG).show();
        } else Toast.makeText(this, nameCheck + " and " + emailCheck, Toast.LENGTH_LONG).show();
    }

    public void onRevertClick(View view) {
        name.setText("");
        email.setText("");
    }
}