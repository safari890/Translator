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

public class SimplePhraseActivity extends AppCompatActivity {
    ListView listview;
    List<String> sim;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_phrase);

        listview = findViewById(R.id.list_view);

        textView= findViewById(R.id.textview);



        sim = new ArrayList<>();
        sim.add("Wakya");
        sim.add("Mutua");
        sim.add("Ngali");
        sim.add("Muunda");
        sim.add("Sukulu");
        sim.add("liu");
        sim.add("Kiveti");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, sim);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"You Selected"+ fruitsList.get(position),Toast.LENGTH_SHORT).show();
                String pos = sim.get(position).toString();
                textView.setText("You Selected  "+ pos);
            }
        });
    }
}
