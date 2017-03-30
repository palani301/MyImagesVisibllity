package com.example.palani.myimagesvisibllity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button1;
    private boolean avail=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.images);
        button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(avail){
                    imageView.setVisibility(View.GONE);
                    avail=false;
                }else{
                    imageView.setVisibility(View.VISIBLE);
                    avail=true;
                }

            }
        });

    }

}
