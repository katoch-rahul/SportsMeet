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
import com.hpu.sportsmeet.Player;
import com.hpu.sportsmeet.R;

public class BDM extends AppCompatActivity {
    DatabaseReference ref;
    TextView men,women,men2,women2,mix;
    String m=" ",w=" ",mm=" ",ww=" ",mw=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdm);
        setTitle("Badminton");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        ref= FirebaseDatabase.getInstance().getReference();
        retrievePlayers();
    }
    public void Killer(View view)
    {
        Intent i=new Intent(this, RegistrationBDM.class);
        startActivity(i);
    }
    public void retrievePlayers()
    {
        Query mSingle=ref.child("Badminton").child("Men Single").orderByKey();
        ValueEventListener vel=new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot ) {
                Player p;
                for(DataSnapshot myItem:dataSnapshot.getChildren())
                {  p=myItem.getValue(Player.class);
                    men=findViewById(R.id.text_bad_men_single);

                    m=m + p.name +" ("+ p.sem+")"+"\n"+" ";

                }men.setText(m);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),"Error "+databaseError,Toast.LENGTH_LONG);
            }
        };
        mSingle.addValueEventListener(vel);

        Query womenSingle=ref.child("Badminton").child("Women Single").orderByKey();
        ValueEventListener vel2=new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot ) {
                Player p;
                for(DataSnapshot myItem:dataSnapshot.getChildren())
                {  p=myItem.getValue(Player.class);
                    men=findViewById(R.id.text_bad_women_single);

                    w=w + p.name +" ("+ p.sem+")"+"\n"+" ";

                }men.setText(w);}

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),"Error "+databaseError,Toast.LENGTH_LONG);
            }
        };
        womenSingle.addValueEventListener(vel2);

        Query men2=ref.child("Badminton").child("Men Double").orderByKey();
        ValueEventListener vel3=new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot ) {
                Player p;
                for(DataSnapshot myItem:dataSnapshot.getChildren())
                {  p=myItem.getValue(Player.class);
                    men=findViewById(R.id.text_bad_men_double);

                    mm=mm + p.name +" - "+p.partner +" ("+ p.sem+")"+"\n"+" ";

                } men.setText(mm);}

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),"Error "+databaseError,Toast.LENGTH_LONG);
            }
        };
        men2.addValueEventListener(vel3);


        Query women2=ref.child("Badminton").child("Women Double").orderByKey();
        ValueEventListener vel4=new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot ) {
                Player p;
                for(DataSnapshot myItem:dataSnapshot.getChildren())
                {  p=myItem.getValue(Player.class);
                    men=findViewById(R.id.text_bad_women_double);

                    ww=ww + p.name +" - "+p.partner +" ("+ p.sem+")"+" ";

                } men.setText(ww);}

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),"Error "+databaseError,Toast.LENGTH_LONG);
            }
        };
        women2.addValueEventListener(vel4);

        Query mix=ref.child("Badminton").child("Mix Double").orderByKey();
        ValueEventListener vel5=new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot ) {
                Player p;
                for(DataSnapshot myItem:dataSnapshot.getChildren())
                {  p=myItem.getValue(Player.class);
                    men=findViewById(R.id.text_bad_mix);

                    mw=mw + p.name +" - "+p.partner +" ("+ p.sem+")"+"\n"+" ";

                } men.setText(mw);}

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(),"Error "+databaseError,Toast.LENGTH_LONG);
            }
        };
        mix.addValueEventListener(vel5);
    }
}
