package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amr Gamal on 1/23/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
   private MediaPlayer mediaPlayer;
   private int ActivityColor;
    public WordAdapter(Activity context,ArrayList<Word> arr,int color)
    {
        super(context,0,arr);
        ActivityColor=color;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word w =getItem(position);
        View v = convertView;
        if(v==null)
        {
            v= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        View textContainer = v.findViewById(R.id.layout);
        TextView t =(TextView) v.findViewById(R.id.english);
        t.setText(w.getEnglish_word());
        TextView te =(TextView) v.findViewById(R.id.miwak);
        te.setText(w.getMiwak_word());
        ImageView i = (ImageView) v.findViewById((R.id.image));

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),ActivityColor);
        // Set the background color of the text container View
         textContainer.setBackgroundColor(color);

        if (w.check()) {

            i.setImageResource(w.getImageResource());
        }
        else
        {
            i.setVisibility(i.GONE);
        }
        return v;
    }
}
