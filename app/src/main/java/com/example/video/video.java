package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity implements MediaController.MediaPlayerControl{
    MediaController controls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        final VideoView visor=(VideoView) findViewById(R.id.videoView);
        final Uri videu=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        final Uri videodos=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videodos);
        ImageView lapto = (ImageView) findViewById(R.id.lapt);
        ImageView ola =(ImageView) findViewById(R.id.ola);
        controls = new MediaController(video.this);
        controls.setAnchorView(findViewById(R.id.view));
        controls.setMediaPlayer(video.this);
        lapto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setVideoURI(videu);
                visor.setMediaController(new MediaController(video.this));
            }
        });
        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setVideoURI(videodos);
                visor.setMediaController(new MediaController(video.this));
            }
        });
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

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
