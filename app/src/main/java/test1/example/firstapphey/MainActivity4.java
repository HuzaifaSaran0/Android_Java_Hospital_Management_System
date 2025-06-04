// PatientBillsActivity.java
package test1.example.firstapphey;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView billsTextView = findViewById(R.id.billsTextView);
        Button btnAppointments = findViewById(R.id.btnAppointments);


        // Static sample bills
        String bills = "📅 10-May-2024\n💰 ₹500\n🩺 Consultation\n\n" +
                "📅 22-May-2024\n💰 ₹800\n🩺 Treatment\n\n" +
                "📅 03-Jun-2024\n💰 ₹300\n🩺 Follow-up\n";

        billsTextView.setText(bills);
        btnAppointments.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
    }
}
