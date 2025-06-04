package test1.example.firstapphey;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView nameView, ageView, genderView, addressView;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nameView = findViewById(R.id.textName);
        ageView = findViewById(R.id.textAge);
        genderView = findViewById(R.id.textGender);
        addressView = findViewById(R.id.textAddress);
        Button btnBills = findViewById(R.id.btnBills);


        // Get data from Intent
        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        String gender = getIntent().getStringExtra("gender");
        String address = getIntent().getStringExtra("address");

        nameView.setText("Name: " + name);
        ageView.setText("Age: " + age);
        genderView.setText("Gender: " + gender);
        addressView.setText("Address: " + address);
        btnBills.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);
        });
    }
}
