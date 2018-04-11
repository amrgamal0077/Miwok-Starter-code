package com.example.android.miwok;

/**
 * Created by Amr Gamal on 1/23/2018.
 */

public class Word {
    private String English_word;
    private String Miwak_word;
    private int ImageResource ;
    private int AudioResource ;
    private  int c=0;
    public Word(String word,String word2,int audioResource)
    {
        AudioResource=audioResource;
        English_word=word;
        Miwak_word=word2;
    }
    public Word(String english_word,String miwak_word,int imageResource,int audioResource)
    {
        AudioResource=audioResource;
        English_word=english_word;
        Miwak_word=miwak_word;
        ImageResource=imageResource;
        c=1;
    }

    public String getEnglish_word()
    {
        return English_word;
    }
    public int getAudioResource(){return  AudioResource;}
    public String getMiwak_word()
    {
        return Miwak_word;
    }
    public int getImageResource(){ return ImageResource; }
    public boolean check(){
        return c!=0;
    }
}
