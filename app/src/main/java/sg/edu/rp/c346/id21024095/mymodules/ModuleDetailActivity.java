package sg.edu.rp.c346.id21024095.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("module");

        if (moduleSelected.equals("C203")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Web Application Development in php");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65H");

        } else if (moduleSelected.equals("C206")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Software Development Process");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E66K");

        } else if (moduleSelected.equals("C218")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: UI/UX Design for Apps");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: ");
            tvVenue.setText("Venue: E66B");

        } else if (moduleSelected.equals("C235")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: IT Security and Management");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E66B");

        } else if (moduleSelected.equals("C346")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Mobile App Development");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62E");

        } else {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Life Skills III");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 1");
            tvVenue.setText("Venue: HB01");
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}