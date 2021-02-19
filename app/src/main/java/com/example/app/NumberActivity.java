package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {
    ListView listview;
    List<Words> num;
    TextView textView;
    WordsAdapter wordsAdapter;
    ImageView wordImage;
    MediaPlayer player;

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releasemethod();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        listview = findViewById(R.id.list_view);
        textView = findViewById(R.id.textview);


        num = new ArrayList<>();
        num.add(new Words("IMWE", "MOJA", R.drawable.avatar, R.raw.kalekye));
        num.add(new Words("ILI", "MBILI", R.drawable.avatar, R.raw.kijana));
        num.add(new Words("ITATU", "TATU", R.drawable.avatar, R.raw.monica));
        num.add(new Words("INYA", "INNE", R.drawable.avatar, R.raw.mwelu));
        num.add(new Words("ITANO ", "TANO", R.drawable.avatar, R.raw.muka));
        num.add(new Words("NTHANTHATU", "SITA", R.drawable.avatar, R.raw.mwelu));
        num.add(new Words("MUONZA", "SABA", R.drawable.avatar, R.raw.ukimwi));
        num.add(new Words("NYAANYA ", "NAME", R.drawable.avatar, R.raw.temb));
        num.add(new Words("KENDA ", "TISA", R.drawable.avatar, R.raw.kalekye));
        num.add(new Words("IKUMI", "KUMI", R.drawable.avatar, R.raw.kijana));


//wordImage= new wordImage();
        wordsAdapter = new WordsAdapter(this, num);
        listview.setAdapter(wordsAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "working", Toast.LENGTH_SHORT).show();
                Words audio = num.get(position);
                releasemethod();
                player = MediaPlayer.create(NumberActivity.this, audio.getAudio());
                player.start();

                player.setOnCompletionListener(completionListener);

            }
        });
    }

    private void releasemethod() {

        if (player != null) {
            player.release();
            player = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasemethod();
    }
}