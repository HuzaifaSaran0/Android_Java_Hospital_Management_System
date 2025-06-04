package test1.example.firstapphey;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    ListView todaysAppointmentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        todaysAppointmentsList = findViewById(R.id.todaysAppointmentsList);

        // Dummy data for now
        String[] appointments = {
                "Patient: Ali - 10:00 AM",
                "Patient: Sana - 11:00 AM",
                "Patient: Ahmed - 12:30 PM",
                "Patient: Maria - 02:00 PM"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                appointments
        );

        todaysAppointmentsList.setAdapter(adapter);
    }
}
