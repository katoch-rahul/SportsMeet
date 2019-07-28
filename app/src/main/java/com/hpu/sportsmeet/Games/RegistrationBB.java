package com.hpu.sportsmeet.Games;

import android.os.Bundle;
import android.support.annotation.NonNull;
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
import com.hpu.sportsmeet.R;
import com.hpu.sportsmeet.Team;

public class RegistrationBB extends AppCompatActivity  {
FirebaseDatabase db;
DatabaseReference ttref;
String key;
String year;
EditText nameCap,name1,name2,name3,name4;
EditText rollCap,roll1,roll2,roll3,roll4,phoneCap;
Spinner sp;
int select;
ScrollView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_registration_bb);
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
          }//name initialise findviewbyID
        {rollCap=findViewById(R.id.register_vb_cap_roll);
        roll1=findViewById(R.id.register_vb_mateRoll1);
        roll2=findViewById(R.id.register_vb_mateRoll2);
        roll3=findViewById(R.id.register_vb_mateRoll3);
        roll4=findViewById(R.id.register_vb_mateRoll4);
         }//roll initialise findviewbyID
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
    {switch(select)
    {
        case 0:year="1st year";break;
        case 1:year="2nd year";break;
        case 2:year="3rd year";break;
        case 3:year="4th year";break;

    }
    Team t=new Team(nameCap.getText().toString(),rollCap.getText().toString(),phoneCap.getText().toString(),
            name1.getText().toString(),roll1.getText().toString(),
            name2.getText().toString(),roll2.getText().toString(),
            name3.getText().toString(),roll3.getText().toString(),
            name4.getText().toString(),roll4.getText().toString(),
             year);

    AddTeam("Basketball",t,ttref);

    }




    public void AddTeam(String game,Team t,DatabaseReference ref)
    {


        key=ref.child(game).push().getKey();
        ref.child(game).child(key).setValue(t)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Snackbar sb1=Snackbar.make(l,"Team Registered Successfully",
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






