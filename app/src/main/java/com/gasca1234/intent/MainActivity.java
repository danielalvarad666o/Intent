package com.gasca1234.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle sevedInstenceState)
        {
            Button b2;
            Button b3;
            Button b4;
            Button b5;
            Button b6;
            Button b7;
            Button b8;
            String _url="https://www.youtube.com/watch?v=2wxHgLlufZQ";
            String _url2="https://www.facebook.com/";
            String _url3="https://web.whatsapp.com/";
            super.onCreate(sevedInstenceState);
            setContentView(R.layout.activity_main);
            b2=findViewById(R.id.dos);
            b3=findViewById(R.id.tres);
            b4=findViewById(R.id.cuatro);
         b5=findViewById(R.id.cinco);
         b6=findViewById(R.id.seis);
         b7=findViewById(R.id.siete);
         b8=findViewById(R.id.ocho);
         b6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Uri _link=Uri.parse(_url3);
                 Intent i = new Intent(Intent.ACTION_VIEW,_link);
                 startActivity(i);
             }
         });
         b7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Uri _link=Uri.parse(_url2);
                 Intent i = new Intent(Intent.ACTION_VIEW,_link);
                 startActivity(i);
             }
         });
b5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Uri _link=Uri.parse(_url);
        Intent i = new Intent(Intent.ACTION_VIEW,_link);
        startActivity(i);
    }
});

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    denew();
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    smit();
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    vamosal3();
                }
            });
        }
        public void regresar(View view)
        {
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);

        }
        public void vamosal3()
        {
            Intent i = new Intent(this,MainActivity3.class);
            startActivity(i);
        }
        public void smit()
        {
            Intent r = new Intent(this,MainActivity4.class);
            startActivity(r);

        }
        public void denew()
        {
            Intent r = new Intent(this,MainActivity5.class);
            startActivity(r);

        }

    }