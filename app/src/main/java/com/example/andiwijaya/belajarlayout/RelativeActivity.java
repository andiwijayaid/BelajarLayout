package com.example.andiwijaya.belajarlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RelativeActivity extends AppCompatActivity {

    TextView statusTV;
    EditText statusET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        statusTV = findViewById(R.id.statusTV);
        statusET = findViewById(R.id.statusET);
        Button updateBT = findViewById(R.id.updateBT);

        updateBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status = statusET.getText().toString();
                statusTV.setText(status);
                statusET.setText(null);


//                statusTV.setText(statusET.getText().toString());
//                statusET.setText(null);
            }
        });
    }
}
