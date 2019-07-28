package com.hpu.sportsmeet.Games;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.hpu.sportsmeet.R;
import com.hpu.sportsmeet.Team;

public class CKT extends AppCompatActivity {
    DatabaseReference ref;
    TextView teams;
    String te=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ckt);

        Toolbar toolbar =findViewById(R.id.toolbar_vb);
        setSupportActionBar(toolbar);

        ref= FirebaseDatabase.getInstance().getReference();
       retrieveTeams();

    }
    public void Killer(View view)
    {
        Intent i=new Intent(this, RegistrationCKT.class);
        startActivity(i);
    }

    public void retrieveTeams() {
        Query mSingle = ref.child("Cricket").orderByKey(); //change child here for next game
        ValueEventListener vel = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Team t;
                for (DataSnapshot myItem : dataSnapshot.getChildren()) {
                    t = myItem.getValue(Team.class);
                  teams = findViewById(R.id.text_teams);

                    te = te + t.year +" - "+t.captain+" ("+t.phone+")"+ "\n\n" + " ";

                }
                teams.setText(te);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(), "Error " + databaseError, Toast.LENGTH_LONG);
            }
        };
        mSingle.addValueEventListener(vel);
    }
}
