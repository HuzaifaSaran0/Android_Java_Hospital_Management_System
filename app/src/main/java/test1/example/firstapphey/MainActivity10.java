package test1.example.firstapphey;
//Doctor_PatientHistoryActivity
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {

    ListView listHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        listHistory = findViewById(R.id.listHistory);

        // Dummy data
        String[] historyData = {
                "Patient: Ahmed\nDisease: Flu\nPrescription: Paracetamol\nProgress: Good",
                "Patient: Sara\nDisease: Diabetes\nPrescription: Metformin\nProgress: Stable",
                "Patient: Ali\nDisease: Hypertension\nPrescription: Amlodipine\nProgress: Improving",
                "Patient: Ayesha\nDisease: Asthma\nPrescription: Inhaler\nProgress: Controlled"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historyData);
        listHistory.setAdapter(adapter);
    }
}
