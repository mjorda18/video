package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView video=(ImageView) findViewById(R.id.imageView);
        ImageView audio=(ImageView) findViewById(R.id.imageView2);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte;
                inte = new Intent(MainActivity.this,audio.class);
                startActivity(inte);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vite;
                vite = new Intent(MainActivity.this,video.class);
                startActivity(vite);
            }
        });
    }

}
