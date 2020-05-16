package com.example.tom_and_jerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tomImageView = findViewById(R.id.tomImageView);
        //tomImageView.animate().scaleX(0.5f).scaleY(0.5f).rotation(3600).setDuration(3000);
    }

    public void eraseTom(View view) {

        if (isTomVisible) {
            ImageView tomImageView = findViewById(R.id.tomImageView);
            tomImageView.animate().rotation(tomImageView.getRotation() + 3600).scaleY(0).scaleX(0).alpha(0).setDuration(4000);
            ImageView jerryImageView = findViewById(R.id.jerryImageView);
            jerryImageView.animate().rotation(jerryImageView.getRotation() + 3600).scaleY(1).scaleX(1).alpha(1).setDuration(4000);
            isTomVisible = false;
        }else {
            ImageView tomImageView = findViewById(R.id.tomImageView);
            tomImageView.animate().rotation(tomImageView.getRotation() + 3600).scaleY(1).scaleX(1).alpha(1).setDuration(4000);
            ImageView jerryImageView = findViewById(R.id.jerryImageView);
            jerryImageView.animate().rotation(jerryImageView.getRotation() + 3600).scaleY(0).scaleX(0).alpha(0).setDuration(4000);

            isTomVisible = true;
        }
    }
}
