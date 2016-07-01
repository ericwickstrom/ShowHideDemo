package com.example.beardsmcgee.showhidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * Basic app demoing setVisibility()
 * clicking a button will hide the selected button and show the hidden button
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button showButton = (Button) findViewById(R.id.showButton);
        final Button hideButton = (Button) findViewById(R.id.hideButton);

        hideButton.setVisibility(View.INVISIBLE);

        showButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                hideButton.setVisibility(View.VISIBLE);
                showButton.setVisibility(View.INVISIBLE);
            }
        });

        hideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                hideButton.setVisibility(View.INVISIBLE);
                showButton.setVisibility(View.VISIBLE);
            }
        });


    }
}
