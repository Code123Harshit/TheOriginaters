package com.example.latestlogin;

// SignUpActivity.java


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText firstName, lastName, email, password, confirmPassword;
    private CheckBox agreement;
    private Button signUpButton;
    private TextView loginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.signupPassword);
        confirmPassword = findViewById(R.id.confirmPassword);
        agreement = findViewById(R.id.agreement);
        signUpButton = findViewById(R.id.signupButton);
        loginLink = findViewById(R.id.loginLink);

        signUpButton.setOnClickListener(v -> {
            // Handle sign-up logic here
            String fName = firstName.getText().toString();
            String lName = lastName.getText().toString();
            String emailStr = email.getText().toString();
            String pass = password.getText().toString();
            String confirmPass = confirmPassword.getText().toString();

            if (pass.equals(confirmPass) && agreement.isChecked()) {
                // Registration successful
                Toast.makeText(SignUpActivity.this, "Sign-up successful!", Toast.LENGTH_SHORT).show();
                // Proceed to login or another activity
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            } else if (!pass.equals(confirmPass)) {
                Toast.makeText(SignUpActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else if (!agreement.isChecked()) {
                Toast.makeText(SignUpActivity.this, "Please agree to the privacy and policy", Toast.LENGTH_SHORT).show();
            }
        });

        loginLink.setOnClickListener(v -> {
            // Navigate to Login Activity
            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
