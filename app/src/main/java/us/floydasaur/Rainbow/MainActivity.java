package us.floydasaur.Rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutBackground;
    Button       buttonRed;
    Button       buttonOrange;
    Button       buttonYellow;
    Button       buttonGreen;
    Button       buttonBlue;
    Button       buttonIndigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons, buttons buttons...
        buttonRed       = findViewById(R.id.button_red);
        buttonOrange    = findViewById(R.id.button_orange);
        buttonYellow    = findViewById(R.id.button_yellow);
        buttonGreen     = findViewById(R.id.button_green);
        buttonBlue      = findViewById(R.id.button_blue);
        buttonIndigo    = findViewById(R.id.button_indigo);

        // Listeners
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Red!");
            }
        });

        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Orange!");
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Yellow!");
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Green!");
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Blue!");
            }
        });

        buttonIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Indigo!");
            }
        });

    }
}
