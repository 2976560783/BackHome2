package com.bigerdranch.android.backhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton leftImageButton;
    private ImageButton middleImageButton;
    private ImageButton rightImmageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftImageButton = (ImageButton) findViewById(R.id.leftImageButton);
        middleImageButton = (ImageButton)findViewById(R.id.middleImageButton);
        rightImmageButton = (ImageButton)findViewById(R.id.rightImageButton);

        leftImageButton.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {

                //test.jsajk
            }
        });

        middleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        rightImmageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

            }
        });
    }
}
