package test1.example.firstapphey;
//Doctor_HistoryUpdateActivity
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    EditText diseaseField, prescriptionField, progressField;
    Button saveHistoryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        diseaseField = findViewById(R.id.inputDisease);
        prescriptionField = findViewById(R.id.inputPrescription);
        progressField = findViewById(R.id.inputProgress);
        saveHistoryBtn = findViewById(R.id.btnSaveHistory);

        saveHistoryBtn.setOnClickListener(v -> {
            String disease = diseaseField.getText().toString();
            String prescription = prescriptionField.getText().toString();
            String progress = progressField.getText().toString();

            // Saving logic (later database or file)
            Toast.makeText(this, "History saved!", Toast.LENGTH_SHORT).show();
        });
    }
}
