package test1.example.firstapphey;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInputEditText usernameField = findViewById(R.id.username);
        TextInputEditText passwordField = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        TextView statusText = findViewById(R.id.statusText);
        Button clearButton = findViewById(R.id.clearButton);
        Button btn = findViewById(R.id.btnOpenSecond);
        Button btnOpenPatient = findViewById(R.id.btnOpenPatient);




        loginButton.setOnClickListener(v -> {
            String username = Objects.requireNonNull(usernameField.getText()).toString();
            String password = Objects.requireNonNull(passwordField.getText()).toString();

            if (username.equals("admin") && password.equals("123")) {
                statusText.setText("Login Successful");
                statusText.setTextColor(Color.GREEN);
            } else {
                statusText.setText("Invalid Username or Password");
                statusText.setTextColor(Color.RED);
            }
        });
        clearButton.setOnClickListener(v -> {
            usernameField.setText("");
            passwordField.setText("");
            statusText.setText("");
        });
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
        btnOpenPatient.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(intent);
        });

    }
}