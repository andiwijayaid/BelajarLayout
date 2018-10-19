package com.example.andiwijaya.belajarlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LinearActivity extends AppCompatActivity {

    private TextView angkatTV;

    private int angka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        angkatTV = findViewById(R.id.angkaTV);

        Button resetBT = findViewById(R.id.resetBT);
        Button kurangBT = findViewById(R.id.kurangBT);
        Button tambahBT = findViewById(R.id.tambahBT);

        kurangBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kurangAngka();
            }
        });

        tambahBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka();
            }
        });
    }

    private void tambahAngka() {
        angka = angka + 1;
//        angka++;
        angkatTV.setText(String.valueOf(angka));
    }

    private void kurangAngka() {
        angka = angka - 1;
//        angka--;
        angkatTV.setText(String.valueOf(angka));
    }

    public void resetAngka(View view) {
        angka = 0;
        angkatTV.setText(String.valueOf(angka));
    }
}
