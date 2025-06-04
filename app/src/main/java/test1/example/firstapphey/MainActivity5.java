package test1.example.firstapphey;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView appointmentsTextView = findViewById(R.id.appointmentsTextView);

        String appointments = "📆 15-Jun-2024 - 11:00 AM\n🩺 Dr. Anil Kumar - General Checkup\n\n" +
                "📆 25-Jun-2024 - 2:30 PM\n🩺 Dr. Meena Shah - Cardiology\n\n" +
                "📆 01-Jul-2024 - 9:00 AM\n🩺 Dr. Ravi Singh - Dental Cleaning\n";

        appointmentsTextView.setText(appointments);
    }
}
