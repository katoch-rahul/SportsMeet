package com.hpu.sportsmeet.Games;

import android.app.AlertDialog;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
 import android.view.View;
import android.widget.AdapterView;

import android.widget.EditText;
import android.widget.Spinner;



import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hpu.sportsmeet.Player;
import com.hpu.sportsmeet.R;

public class RegistrationTT extends AppCompatActivity  {
FirebaseDatabase db;
DatabaseReference ttref;
String key;
EditText name,sem,roll,phone,partner;
Spinner sp;
int select;
ConstraintLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Table Tennis Registration");
        setContentView(R.layout.activity_registrationtt);
        sp=findViewById(R.id.spinn);
        db=FirebaseDatabase.getInstance();
        ttref=db.getReference();

        name=findViewById(R.id.register_tt_name);
        sem=findViewById(R.id.register_tt_sem);
        roll=findViewById(R.id.register_tt_roll);
        phone=findViewById(R.id.register_tt_phone);
        l=findViewById(R.id.layy);
        partner=findViewById(R.id.tt_hiden);
        spinnerChoice(sp);







    }


    public void spinnerChoice(Spinner spinner)
    {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select=position;
                if(position<2)
                    partner.setVisibility(View.GONE);
                if(position>=2)
                    partner.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                select=69;
            }
        });
    }


    public void onClicka(View view)
    {


        if(select<=2) {
            Player p = new Player(name.getText().toString(), sem.getText().toString(), roll.getText().toString(),
                    phone.getText().toString());
            Add("TableTennis", p , select,ttref);
        }
        else {
            Player p = new Player(name.getText().toString(), partner.getText().toString(), sem.getText().toString(), roll.getText().toString(),
                    phone.getText().toString());
            Add("TableTennis", p , select,ttref);
        }



    }




    public void Add(String game, Player p,int sel,DatabaseReference ref)
    {
        String cat = "Open for All";




    if(game=="TableTennis")
    {
            switch(sel)
        {
            case 0:cat="Men Single";break;
            case 1:cat="Women Single";break;
            case 2:cat="Men Double";break;
            case 3:cat="Women Double";break;
            case 4:cat="Mix Double";break;
        }

       String key=ref.child(game).child(cat).push().getKey();
        ref.child(game).child(cat).child(key).setValue(p)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Snackbar sb0=Snackbar.make(l,name.getText().toString()+" Registered Successfully",
                        Snackbar.LENGTH_LONG );
                sb0.show();
             }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Snackbar sb0=Snackbar.make(l,name.getText().toString()+"Not Registered Successfully",
                        Snackbar.LENGTH_LONG );
                sb0.show();
            }
        });



    }

    }




}

