package com.gasca1234.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button1;

        button1=findViewById(R.id.regreso);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir();

            }


        });
    }
    public void abrir()
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

}