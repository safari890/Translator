package com.example.app;

public class Words {
    String english_word;
    String Kiswahili_word;
    int word_image;
    int audio;

    public int getWord_image() {
        return word_image;
    }

    public void setWord_image(int word_image) {
        this.word_image = word_image;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public Words(String english_word, String kiswahili_word, int word_image, int audio) {
        this.english_word = english_word;
        Kiswahili_word = kiswahili_word;
        this.word_image = word_image;
        this.audio = audio;

    }

    public String getEnglish_word() {
        return english_word;
    }

    public void setEnglish_word(String english_word) {
        this.english_word = english_word;
    }

    public String getKiswahili_word() {
        return Kiswahili_word;
    }

    public void setKiswahili_word(String kiswahili_word) {
        Kiswahili_word = kiswahili_word;
    }
}
