package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class sportsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Sports</font>"));
        setContentView(R.layout.sport_list);

        final ArrayList<Sport> sportslist = new ArrayList<Sport>();

        sportslist.add(new Sport(R.string.badminton,R.drawable.badminton));
        sportslist.add(new Sport(R.string.football,R.drawable.football));
        sportslist.add(new Sport(R.string.tablettennis,R.drawable.table));
        sportslist.add(new Sport(R.string.tennis,R.drawable.tennis));
        sportslist.add(new Sport(R.string.chess,R.drawable.chess));
        sportslist.add(new Sport(R.string.boxing,R.drawable.boxing));
        sportslist.add(new Sport(R.string.cricket,R.drawable.cricket));
        sportslist.add(new Sport(R.string.marts,R.drawable.marts));
        sportslist.add(new Sport(R.string.volleyball,R.drawable.volleyball));
        sportslist.add(new Sport(R.string.kabaddi,R.drawable.kabaddi));
        sportslist.add(new Sport(R.string.squash,R.drawable.squash));
        sportslist.add(new Sport(R.string.lifting,R.drawable.wlifting));


        SportAdapter adapter = new SportAdapter(this, sportslist);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Sport sport = sportslist.get(position);
                String sportName = getString(sport.getSportName());
                Intent sports = null;
                switch (position){
                    case 0:
                        sports = new Intent(sportsList.this,Badminton.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 1:
                        sports = new Intent(sportsList.this,Football.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 2:
                        sports = new Intent(sportsList.this,TableTennis.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 3:
                        sports = new Intent(sportsList.this,Tennis.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 4:
                        sports = new Intent(sportsList.this,Chess.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 5:
                        sports = new Intent(sportsList.this,Boxing.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 6:
                        sports = new Intent(sportsList.this,Cricket.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 7:
                        sports = new Intent(sportsList.this,MartialArts.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 8:
                        sports = new Intent(sportsList.this,Volleyball.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 9:
                        sports = new Intent(sportsList.this,Kabaddi.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 10:
                        sports = new Intent(sportsList.this,Squash.class);
                        sports.putExtra("int_value",position);
                        break;
                    case 11:
                        sports = new Intent(sportsList.this,Weightlifting.class);
                        sports.putExtra("int_value",position);
                        break;
                }
                startActivity(sports);
            }
        });


    }
}
