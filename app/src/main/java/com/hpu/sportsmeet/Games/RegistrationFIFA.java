package com.hpu.sportsmeet.Games;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hpu.sportsmeet.Player;
import com.hpu.sportsmeet.R;

public class RegistrationFIFA extends AppCompatActivity  {
FirebaseDatabase db;
DatabaseReference ttref;
String key;
EditText name,sem,roll,phone;


ConstraintLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration_fifa);

        db=FirebaseDatabase.getInstance();
        ttref=db.getReference();

        name=findViewById(R.id.register_name);
        sem=findViewById(R.id.register_sem);
        roll=findViewById(R.id.register_roll);
        phone=findViewById(R.id.register_phone);
        l=findViewById(R.id.reg_layy);









    }





    public void onClicka(View view)
    {



            Player p = new Player(name.getText().toString(), sem.getText().toString(), roll.getText().toString(),
                    phone.getText().toString());
            Add("FIFA", p ,ttref);



    }




    public void Add(String game, Player p,DatabaseReference ref)
    {








       key=ref.child(game).push().getKey();
        ref.child(game).child(key).setValue(p)
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

