package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Football</font>"));
        setContentView(R.layout.activity_sports_layout);
        ImageView mainImage = (ImageView) findViewById(R.id.sportimg);
        mainImage.setImageResource(R.drawable.football);

        TextView text = (TextView) findViewById(R.id.text);
        text.setMovementMethod(new ScrollingMovementMethod());
        text.setText("Format of Play: Best of 3 in the order Singles,\n" +
                "Doubles, Singles\n" +
                "\n" +
                "Each match (singles/doubles) will be a best of 3 of\n" +
                "21 points each\n" +
                "\n" +
                "Teams for every game are to be submitted before\n" +
                "the match.\n" +
                "\n" +
                "Latest IBF rules will be followed.\n" +
                "\n" +
                "Teams of maximum 5 players and minimum 3\n" +
                "players are allowed.\n" +
                "\n" +
                "Only one player can play in two matches (one\n" +
                "singles and one doubles)\n" +
                "\n" +
                "Decision of referees and Organising Committee\n" +
                "will be final and binding.\n" +
                "\n" +
                "Anirudh Singh\n" +
                "7023291861\n" +
                "Brajesh Agrawal\n" +
                "8432631000\n" +
                "Bharat Paliwal\n"+
                "6377541668\n");

        ImageView fix = (ImageView) findViewById(R.id.fixtures);

        fix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent fixturesIntent = new Intent(Football.this, Fixtures.class);
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
                Intent fixturesIntent = new Intent(Football.this, Results.class);
                Intent intent = getIntent();
                int position = intent.getIntExtra("int_value", 0);
                fixturesIntent.putExtra("int_value",position);
                startActivity(fixturesIntent);
            }
        });
    }
}
