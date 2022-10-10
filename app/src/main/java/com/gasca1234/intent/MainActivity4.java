package com.gasca1234.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView mTextField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mTextField = findViewById(R.id.contador2);
        CountDownTimer CountDownTimer = new CountDownTimer(20000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("Falta: " + millisUntilFinished / 1000 + "segundos");

            }

            public void onFinish() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));


            }
        }.start();
    }
}

