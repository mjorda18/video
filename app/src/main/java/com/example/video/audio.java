package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;

public class audio extends AppCompatActivity implements MediaController.MediaPlayerControl {
    MediaController controls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        ImageView sanic = (ImageView) findViewById(R.id.imageView5);
        ImageView windo = (ImageView) findViewById(R.id.imageView3);
        ImageView sega = (ImageView) findViewById(R.id.imageView4);
        controls = new MediaController(audio.this);
        controls.setAnchorView(findViewById(R.id.view));
        controls.setMediaPlayer(audio.this);
        sanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mediaPlayer = MediaPlayer.create(audio.this, R.raw.gren);
                mediaPlayer.start();
                controls.show();

            }
        });
        windo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(audio.this, R.raw.windo);
                mediaPlayer.start();

            }
        });
        sega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(audio.this, R.raw.sega);
                mediaPlayer.start();

            }
        });
    }

    @Override
    public void start() {

    }

    @Override
    public void pause() {

    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        return 0;
    }

    @Override
    public void seekTo(int pos) {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public boolean canPause() {
        return true;
    }

    @Override
    public boolean canSeekBackward() {
        return false;
    }

    @Override
    public boolean canSeekForward() {
        return false;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }

}

