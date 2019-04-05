package us.floydasaur.Rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutBackground;
    Button       buttonRed,   buttonOrange,  buttonYellow,
                 buttonGreen, buttonBlue,    buttonIndigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons, buttons buttons... and a layout
        buttonRed        = findViewById(R.id.button_red);
        buttonOrange     = findViewById(R.id.button_orange);
        buttonYellow     = findViewById(R.id.button_yellow);
        buttonGreen      = findViewById(R.id.button_green);
        buttonBlue       = findViewById(R.id.button_blue);
        buttonIndigo     = findViewById(R.id.button_indigo);
        layoutBackground = findViewById(R.id.layout_background);

        // Listeners
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Red!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            }
        });

        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Orange!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Yellow!");
                layoutBackground.setBackgroundColor(getResources().getColor(R.color.colorYellow));
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Green!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Blue!");
                layoutBackground.setBackgroundColor(getResources().getColor(R.color.colorBlue));
            }
        });

        buttonIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Indigo!");
                layoutBackground.setBackgroundColor(getResources().getColor(R.color.colorIndigo));
            }
        });

    }
}
