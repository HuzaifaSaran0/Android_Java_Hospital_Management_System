package test1.example.firstapphey;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {

    EditText inputPatientName, inputDate, inputCharges, inputNotes;
    Button btnGenerateBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        inputPatientName = findViewById(R.id.inputPatientName);
        inputDate = findViewById(R.id.inputDate);
        inputCharges = findViewById(R.id.inputCharges);
        inputNotes = findViewById(R.id.inputNotes);
        btnGenerateBill = findViewById(R.id.btnGenerateBill);

        btnGenerateBill.setOnClickListener(v -> {
            String name = inputPatientName.getText().toString();
            String date = inputDate.getText().toString();
            String charges = inputCharges.getText().toString();
            String notes = inputNotes.getText().toString();

            // No actual database logic needed
            Toast.makeText(this, "Bill Generated for " + name, Toast.LENGTH_LONG).show();
        });
    }
}
