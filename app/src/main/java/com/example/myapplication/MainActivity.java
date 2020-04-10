package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton prev , next;
    ImageView images;
    TextView text;
    int currentImage = 0;
    //0-1-2-3-0-1-2-3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v){
        text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        int x = this.getResources() .getIdentifier(idX, "id", getPackageName());
        images = findViewById(x);
        images.setAlpha(0f);

        currentImage = (currentImage - 1);
        String idY = "pic" + currentImage;
        int y = this.getResources() .getIdentifier(idX, "id", getPackageName());
        images = findViewById(y);
        images.setAlpha(1f);


    }
    public void next(View v){
        text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        int x = this.getResources() .getIdentifier(idX, "id", getPackageName());
        images = findViewById(x);
        images.setAlpha(0f);

        currentImage = (currentImage + 1);
        String idY = "pic" + currentImage;
        int y = this.getResources() .getIdentifier(idX, "id", getPackageName());
        images = findViewById(y);
        images.setAlpha(1f);

    }
}

