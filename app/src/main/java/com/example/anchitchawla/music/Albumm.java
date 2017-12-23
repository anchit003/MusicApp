package com.example.anchitchawla.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albumm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albumm);
        Button button=(Button) findViewById(R.id.playlist);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent playlist = new Intent(Albumm.this, Playlistt.class);
                startActivity(playlist);
            }
        });
        Button button2= (Button)findViewById(R.id.track);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent tracks=new Intent(Albumm.this,Trackk.class);
                startActivity(tracks);
            }
        });
        Button button1=(Button)findViewById(R.id.nowplaying);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Albumm.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
