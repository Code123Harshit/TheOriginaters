package com.example.latestlogin;

// LoginActivity.java


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private CheckBox rememberMe;
    private Button loginButton;
    private TextView forgotPassword, signUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        rememberMe = findViewById(R.id.rememberMe);
        loginButton = findViewById(R.id.loginButton);
        forgotPassword = findViewById(R.id.forgotPassword);
        signUpLink = findViewById(R.id.signUpLink);

        loginButton.setOnClickListener(v -> {
            // Handle login logic here
            String user = username.getText().toString();
            String pass = password.getText().toString();

            if (user.equals("admin") && pass.equals("password")) {
                // Successful login
                Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
                // Proceed to another activity
            } else {
                Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_LONG);
                        Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });

        forgotPassword.setOnClickListener(v -> {
            // Handle forgot password logic
            Toast.makeText(MainActivity.this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show();
        });

        signUpLink.setOnClickListener(v -> {
            // Navigate to Sign-Up Activity
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}
