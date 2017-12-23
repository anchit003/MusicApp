package com.example.anchitchawla.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Playlistt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlistt);
        Button button=(Button)findViewById(R.id.newplay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Playlistt.this,"This is just a template",Toast.LENGTH_LONG).show();
            }
        });
        Button button1=(Button)findViewById(R.id.nowplaying);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Playlistt.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button button2= (Button)findViewById(R.id.track);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent tracks=new Intent(Playlistt.this,Trackk.class);
                startActivity(tracks);
            }
        });
        Button button3=(Button)findViewById(R.id.album);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albums = new Intent(Playlistt.this,Albumm.class);
                startActivity(albums);
            }
        });
    }
}
