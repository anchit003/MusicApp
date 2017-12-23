package com.example.anchitchawla.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button) findViewById(R.id.playlist);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent playlist_activity = new Intent(MainActivity.this, com.example.anchitchawla.music.Playlistt.class);
                startActivity(playlist_activity);
            }
        });

        Button button1= (Button)findViewById(R.id.track);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent tracks_activity=new Intent(MainActivity.this,com.example.anchitchawla.music.Trackk.class);
                startActivity(tracks_activity);
            }
        });
        Button button2=(Button)findViewById(R.id.album);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albums_activity = new Intent(MainActivity.this,com.example.anchitchawla.music.Albumm.class);
                startActivity(albums_activity);
            }
        });

    }
}
