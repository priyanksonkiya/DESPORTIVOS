package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Cricket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Cricket</font>"));
        setContentView(R.layout.activity_sports_layout);


        ImageView mainImage = (ImageView) findViewById(R.id.sportimg);
        mainImage.setImageResource(R.drawable.cricket);

        TextView text = (TextView) findViewById(R.id.text);
        text.setMovementMethod(new ScrollingMovementMethod());
        text.setText("1. Format of Play: Best of 3 in the order Singles,Doubles, Singles\n"+
                "2. Each match (singles/doubles) will be a best of 3 of points each\n"+
                "3. Teams for every game are to be submitted before\n" +
                "the match.\n" +
                "4. Latest IBF rules will be followed.\n"+
                "5. Teams of maximum 5 players and minimum 3 players are allowed.\n"+
                "6. Only one player can play in two matches (one singles and one doubles)\n"+
                "\n"+
                "Decision of referees and Organising Committee will be final and binding.\n"+
                "\nCONTACT : \n"+ "\n"+
                "Anirudh Singh : 7023291861\n" +
                "Brajesh Agrawal : 432631000\n" +
                "Bharat Paliwal : 6377541668\n");

        ImageView fix = (ImageView) findViewById(R.id.fixtures);

        fix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent fixturesIntent = new Intent(Cricket.this, Fixtures.class);
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
                Intent fixturesIntent = new Intent(Cricket.this, Results.class);
                Intent intent = getIntent();
                int position = intent.getIntExtra("int_value", 0);
                fixturesIntent.putExtra("int_value",position);
                startActivity(fixturesIntent);
            }
        });







    }
}
