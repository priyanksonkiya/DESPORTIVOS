package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Boxing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Boxing</font>"));
        setContentView(R.layout.activity_sports_layout);


        ImageView mainImage = (ImageView) findViewById(R.id.sportimg);
        mainImage.setImageResource(R.drawable.boxing);

        TextView text = (TextView) findViewById(R.id.text);
        text.setMovementMethod(new ScrollingMovementMethod());
        text.setText("Men and Women Team\n"+
                "1. Maximum number of players per team are 12\n"+
                "\n"+
                "2. The match will consist of 4 quarters, each quarter lasting 10\n"+
                "minutes (unless mentioned otherwise).\n"+
                "\n"+
                "3. Fixtures and schedule for matches will be put up at the time of\n"+
                "on-desk registration. Timings for the matches will be strictly\n"+
                "adhered to.\n"+
                "\n"+
                "4. Officials will keep score and their decisions will be final.\n"+
                "\n"+
                "Devendra Shekhawat\n"+
                "+91-6378651940\n"+
                "\n"+
                "Priyank\n"+
                "+91-7895323230\n"+
                "\n"+
                "Mriganshi Sharma\n"+
                "+91-7976159409\n");

        ImageView fix = (ImageView) findViewById(R.id.fixtures);

        fix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent fixturesIntent = new Intent(Boxing.this, Fixtures.class);
                Intent intent = getIntent();
                int position = intent.getIntExtra("int_value", 0);
                fixturesIntent.putExtra("int_value",position);
                startActivity(fixturesIntent);
            }
        });

        ImageView res = (ImageView) findViewById(R.id.result);

        res.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent fixturesIntent = new Intent(Boxing.this, Results.class);
                Intent intent = getIntent();
                int position = intent.getIntExtra("int_value", 0);
                fixturesIntent.putExtra("int_value",position);
                startActivity(fixturesIntent);
            }
        });








    }
}
