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


public class Results extends AppCompatActivity {

    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mFixReference = database.child("Results");
    ListView listView;
    FirebaseListAdapter<com.example.desportivos.Result> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

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

        FirebaseListOptions<com.example.desportivos.Result> options = new FirebaseListOptions.Builder<com.example.desportivos.Result>()
                .setLayout(R.layout.layout_result)
                .setQuery(query, com.example.desportivos.Result.class)
                .build();
        adapter = new FirebaseListAdapter(options) {
            @Override
            protected void populateView(View v,Object model, int position) {
                TextView round = v.findViewById(R.id.round);
                TextView team1 = v.findViewById(R.id.team1);
                TextView team2 = v.findViewById(R.id.team2);
                TextView team1points = v.findViewById(R.id.team1points);
                TextView team2points = v.findViewById(R.id.team2points);

                com.example.desportivos.Result res = (com.example.desportivos.Result) model;
                round.setText(res.getRound());
                team1.setText(res.getTeam1());
                team2.setText(res.getTeam2());
                team1points.setText(res.getTeam1points());
                team2points.setText(res.getTeam2points());



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
