package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseListOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


public class Fixtures extends AppCompatActivity {

    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mFixReference = database.child("Fixtures");
    ListView listView;
    FirebaseListAdapter<Fixture> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);

        listView = (ListView) findViewById(R.id.list);

        Intent intent = getIntent();
        int position = intent.getIntExtra("int_value", 0);
        Query query = mFixReference.child("Badminton");;
        ;

        switch (position) {
            case 0:
                query =  mFixReference.child("Badminton");
                break;
            case 1:
                query =  mFixReference.child("Football");
                break;
            case 2:
                query =  mFixReference.child("TableTennis");
                break;
            case 3:
                query =  mFixReference.child("Tennis");
                break;
            case 4:
                query =  mFixReference.child("Chess");
                break;
            case 5:
                query =  mFixReference.child("Boxing");
                break;
            case 6:
                query =  mFixReference.child("Cricket");
                break;
            case 7:
                query =  mFixReference.child("MartialArts");
                break;
            case 8:
                query =  mFixReference.child("Volleyball");
                break;
            case 9:
                query =  mFixReference.child("Kabaddi");
                break;
            case 10:
                query =  mFixReference.child("Squash");
                break;
            case 11:
                query =  mFixReference.child("Weightlifting");
                break;




        }

        FirebaseListOptions<Fixture> options = new FirebaseListOptions.Builder<Fixture>()
                .setLayout(R.layout.layout_fixture)
                .setQuery(query, Fixture.class)
                .build();
        adapter = new FirebaseListAdapter(options) {
            @Override
            protected void populateView(View v,Object model, int position) {
                TextView round = v.findViewById(R.id.round);
                TextView team1 = v.findViewById(R.id.team1);
                TextView team2 = v.findViewById(R.id.team2);
                TextView time = v.findViewById(R.id.time);

                Fixture fix = (Fixture) model;
                round.setText(fix.getRound());
                team1.setText(fix.getTeam1());
                team2.setText(fix.getTeam2());
                time.setText(fix.getTime());



            }
        };

        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
