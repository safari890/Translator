package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {
    ListView listview;
    List<String> fam;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


        listview = findViewById(R.id.list_view);

        textView= findViewById(R.id.textview);



        fam = new ArrayList<>();
        fam.add("MUSYI WA MUTUA");
        fam.add(" MUSYI WA MUTUNGA");
        fam.add("MUSYI WA MULI");
        fam.add("MUSYI WA KIOKO");
        fam.add(" MUSYI WA NGUNDO");
        fam.add(" MUSYI WASIMIYU");
        fam.add("MUSYI WA MAKHOHA");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, fam);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"You Selected"+ fruitsList.get(position),Toast.LENGTH_SHORT).show();
                String pos = fam.get(position).toString();
                textView.setText("You Selected  "+ pos);
            }
        });
    }
}
