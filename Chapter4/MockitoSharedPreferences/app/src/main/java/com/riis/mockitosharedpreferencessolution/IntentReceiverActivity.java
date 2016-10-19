package com.riis.mockitosharedpreferencessolution;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentReceiverActivity extends Activity {

    TextView usernameTextfield, passwordTextfield, emailTextfield;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Bundle bundle = getIntent().getExtras();

        String result1 = bundle.getString("Username");
        String result2 = bundle.getString("Password");
        String result3 = bundle.getString("Email");


        usernameTextfield=(TextView)findViewById(R.id.usertxt_field);
        passwordTextfield=(TextView)findViewById(R.id.passtxt_field);
        emailTextfield=(TextView)findViewById(R.id.emailtxt_field);

        usernameTextfield.setText("Username:"+result1);
        passwordTextfield.setText("Password:"+result2);
        emailTextfield.setText("Email:"+result3);

    }
}
