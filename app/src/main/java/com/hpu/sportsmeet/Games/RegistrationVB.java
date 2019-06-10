package com.hpu.sportsmeet.Games;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hpu.sportsmeet.Player;
import com.hpu.sportsmeet.R;
import com.hpu.sportsmeet.Team;

public class RegistrationVB extends AppCompatActivity  {
FirebaseDatabase db;
DatabaseReference ttref;
String key;
String year;
EditText nameCap,name1,name2,name3,name4,name5;
EditText rollCap,roll1,roll2,roll3,roll4,roll5,phoneCap;
Spinner sp;
int select;
ScrollView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_registration_vb);
        sp=findViewById(R.id.register_vb_spinn);
        db=FirebaseDatabase.getInstance();
        ttref=db.getReference();
        l=findViewById(R.id.register_vb_scroll);
        {
            nameCap=findViewById(R.id.register_vb_cap);
        name1=findViewById(R.id.register_vb_mate1);
        name2=findViewById(R.id.register_vb_mate2);
        name3=findViewById(R.id.register_vb_mate3);
        name4=findViewById(R.id.register_vb_mate4);
        name5=findViewById(R.id.register_vb_mate5);}//name initialise findviewbyID
        {rollCap=findViewById(R.id.register_vb_cap_roll);
        roll1=findViewById(R.id.register_vb_mateRoll1);
        roll2=findViewById(R.id.register_vb_mateRoll2);
        roll3=findViewById(R.id.register_vb_mateRoll3);
        roll4=findViewById(R.id.register_vb_mateRoll4);
        roll5=findViewById(R.id.register_vb_mateRoll5);}//roll initialise findviewbyID
        phoneCap=findViewById(R.id.register_vb_cap_phone);

        spinnerChoice(sp);












    }


    public void spinnerChoice(Spinner spinner)
    {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select=position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                select=69;
            }
        });
    }


    public void onClicka(View view)
    {
    Team t=new Team(nameCap.getText().toString(),rollCap.getText().toString(),phoneCap.getText().toString(),
            name1.getText().toString(),roll1.getText().toString(),
            name2.getText().toString(),roll2.getText().toString(),
            name3.getText().toString(),roll3.getText().toString(),
            name4.getText().toString(),roll4.getText().toString(),
            name5.getText().toString(),roll5.getText().toString());

    AddTeam("Volley Ball",t,select,ttref);

    }




    public void AddTeam(String game,Team t,int sel,DatabaseReference ref)
    {
        switch(sel)
        {
            case 0:year="1st Year";break;
            case 1:year="2nd Year";break;
            case 2:year="3rd Year";break;
            case 3:year="4th Year";break;

        }

        key=ref.child(game).child(year).push().getKey();
        ref.child(game).child(year).child(key).setValue(t)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Snackbar sb1=Snackbar.make(l," Registered Successfully",
                                Snackbar.LENGTH_LONG );
                        sb1.show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Snackbar sb0=Snackbar.make(l,"Registration Unsuccessful",
                        Snackbar.LENGTH_LONG );
                sb0.show();
            }
        });












    }

    }






