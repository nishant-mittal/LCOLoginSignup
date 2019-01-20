package com.example.android.loginsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Main2Activity extends AppCompatActivity {

    public Boolean condition;
    public String name, email, password, confirmPassword;
    public EditText nameEditText, emailEditText, passwordEditText, confirmPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);

        name = nameEditText.getText().toString().trim();
        email = emailEditText.getText().toString().trim();
        password = passwordEditText.getText().toString().trim();
        confirmPassword = confirmPasswordEditText.getText().toString().trim();


    }

    public void submit(View view) {
        Toasty.success(this, "Account Created!", Toast.LENGTH_SHORT, true).show();
    }
}
