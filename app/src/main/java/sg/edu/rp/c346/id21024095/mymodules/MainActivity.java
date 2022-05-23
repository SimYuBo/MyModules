package sg.edu.rp.c346.id21024095.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.textViewC203);
        tvC206 = findViewById(R.id.textViewC206);
        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);
        tvG953 = findViewById(R.id.textViewG953);

        // Module C203
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C203");
                startActivity(intent);
            }
        });

        // Module C206
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C206");
                startActivity(intent);
            }
        });

        // Module C218
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C218");
                startActivity(intent);
            }
        });

        // Module C235
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C235");
                startActivity(intent);
            }
        });

        // Module C346
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C346");
                startActivity(intent);
            }
        });

        // Module G953
        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "G953");
                startActivity(intent);
            }
        });


    }
}