package test1.example.firstapphey;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    Button btnTodayAppointments, btnHistoryUpdate, btnGenerateBill, btnPatientHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btnTodayAppointments = findViewById(R.id.btnTodayAppointments);
        btnHistoryUpdate = findViewById(R.id.btnHistoryUpdate);
        btnGenerateBill = findViewById(R.id.btnGenerateBill);
        btnPatientHistory = findViewById(R.id.btnPatientHistory);

        btnTodayAppointments.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
            startActivity(intent);
        });

        btnHistoryUpdate.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity6.this, MainActivity8.class);
            startActivity(intent);
        });

        btnGenerateBill.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
            startActivity(intent);
        });

        btnPatientHistory.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity6.this, MainActivity10.class);
            startActivity(intent);
        });
    }
}
