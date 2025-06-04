package test1.example.firstapphey;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText nameField, ageField, genderField, addressField;
    Button savePatientBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameField = findViewById(R.id.inputName);
        ageField = findViewById(R.id.inputAge);
        genderField = findViewById(R.id.inputGender);
        addressField = findViewById(R.id.inputAddress);
        savePatientBtn = findViewById(R.id.btnSavePatient);

        savePatientBtn.setOnClickListener(v -> {
            String name = nameField.getText().toString();
            String age = ageField.getText().toString();
            String gender = genderField.getText().toString();
            String address = addressField.getText().toString();

            if (name.isEmpty() || age.isEmpty() || gender.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(this, "Patient saved: " + name, Toast.LENGTH_SHORT).show();

            // Go to Patient Home Activity
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("name", name);
            intent.putExtra("age", age);
            intent.putExtra("gender", gender);
            intent.putExtra("address", address);
            startActivity(intent);
        });
    }
}
