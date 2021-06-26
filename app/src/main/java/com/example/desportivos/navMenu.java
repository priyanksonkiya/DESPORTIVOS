package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

public class navMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Menu </font>"));
        setContentView(R.layout.activity_nav_menu);

        ImageView bus = (ImageView) findViewById(R.id.bus);

        bus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buswebInstance = new Intent(navMenu.this, busWebView.class);
                startActivity(buswebInstance);
            }
        });

        ImageView sports = (ImageView) findViewById(R.id.sports);

        sports.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sportsList = new Intent(navMenu.this, sportsList.class);
                startActivity(sportsList);
            }
        });

        ImageView gallery = (ImageView) findViewById(R.id.funevent);

        gallery.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(navMenu.this, Gallery.class);
                startActivity(galleryIntent);
            }
        });

        ImageView contact = (ImageView) findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(navMenu.this, ContactUs.class);
                startActivity(contactIntent);
            }
        });



    }
}
