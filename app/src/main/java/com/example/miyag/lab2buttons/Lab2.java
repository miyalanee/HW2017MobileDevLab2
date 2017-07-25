package com.example.miyag.lab2buttons;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Blue_Button;
    private Button Green_Button;
    private LinearLayout BackgroundColor;
    private TextView update_mood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BackgroundColor = (LinearLayout) findViewById(R.id.background);
        update_mood = (TextView)findViewById(R.id.text_mid);

        Blue_Button = (Button) findViewById(R.id.blue_button);
        Blue_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(update_mood.getText() != "Now we are feeling blue") {
                    BackgroundColor.setBackgroundColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_blue_bright));
                    Toast.makeText(MainActivity.this, "Now we are feeling blue", Toast.LENGTH_SHORT).show();
                    update_mood.setText("Now we are feeling blue");
                }
            }
        });

        Green_Button = (Button) findViewById(R.id.green_button);
        Green_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(update_mood.getText() != "Now we are feeling green") {
                    Toast.makeText(MainActivity.this, "Now we are feeling green", Toast.LENGTH_SHORT).show();
                    TextView update_mood = (TextView) findViewById(R.id.text_mid);
                    update_mood.setText("Now we are feeling green");
                    BackgroundColor.setBackgroundColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_green_light));
                }
            }
        });
    }
}
