package com.example.anchitchawla.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Trackk extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackk);
        ArrayList<musictaste>list=new ArrayList<musictaste>();
        list.add(new musictaste("3Peg","Single",R.drawable.peg));
        list.add(new musictaste("Daaru Party","Single",R.drawable.daru));
        list.add(new musictaste("5 Tara","Single",R.drawable.fivestar));
        list.add(new musictaste("aaru Desi","Cocktail",R.drawable.cocktail));
        TrackAdapter musictasteadapter = new TrackAdapter(this,list);
        ListView listView1=(ListView)findViewById(R.id.mylist);
        listView1.setAdapter(musictasteadapter);
        Button button1=(Button)findViewById(R.id.nowplaying);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Trackk.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button button2=(Button)findViewById(R.id.album);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albums = new Intent(Trackk.this,Albumm.class);
                startActivity(albums);
            }
        });
        Button button=(Button) findViewById(R.id.playlist);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent playlist = new Intent(Trackk.this, Playlistt.class);
                startActivity(playlist);
            }
        });

    }
    }

