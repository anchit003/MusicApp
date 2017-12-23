package com.example.anchitchawla.music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Anchit Chawla on 24-11-2017.
 */

public class TrackAdapter extends ArrayAdapter<musictaste> {

    public TrackAdapter(Context context, List<musictaste>androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if(view ==null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.customlayout, parent, false);
        }
            musictaste musictaste=getItem(position);
            TextView textView=(TextView)view.findViewById(R.id.textView_name);
            textView.setText(musictaste.getTitlee());
            TextView textView1=(TextView)view.findViewById(R.id.textView2_desc);
            textView1.setText(musictaste.getAlbumm());
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            imageView.setImageResource(musictaste.getImgid());
            return view;
    }
}
