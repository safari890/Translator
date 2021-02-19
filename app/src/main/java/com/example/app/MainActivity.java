package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button number,family,colors,simplephrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.Numbers);
        family = findViewById(R.id.Family);
        colors = findViewById(R.id.Colors);
        simplephrases = findViewById(R.id.Simplephrases);



        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NumberActivity.class);
                startActivity(intent);

            }


        });


        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), FamilyActivity.class);
                startActivity(intent);

            }


        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ColorActivity.class);
                startActivity(intent);

            }


        });
        simplephrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SimplePhraseActivity.class);
                startActivity(intent);

            }


        });
    }
}
