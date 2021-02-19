package com.example.app;

import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app.R;

import java.util.List;

public class WordsAdapter extends BaseAdapter {
    Context context;
    List<Words> wordList;

    public WordsAdapter(Context context , List<Words> wordList){

        this.context= context;
        this.wordList = wordList;
    }

    @Override
    public int getCount() {
        return wordList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        TextView englishWord = view.findViewById(R.id.English);
        TextView kiswahiliWord = view.findViewById(R.id.Kiswahili);
        ImageView wordImage  = view.findViewById(R.id.word_image);
        //MediaStore.Audio audio = view.findViewById(R.id.);
        wordImage.setImageResource(wordList.get(position).getWord_image());

        englishWord.setText(wordList.get(position).getEnglish_word());
        kiswahiliWord.setText(wordList.get(position).getKiswahili_word());


        return view;
    }




}
