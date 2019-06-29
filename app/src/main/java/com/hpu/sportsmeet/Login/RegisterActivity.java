package com.hpu.sportsmeet.Login;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hpu.sportsmeet.R;
import com.hpu.sportsmeet.User;

public class RegisterActivity extends AppCompatActivity {
    EditText name, email, roll, pass, sem;
    FirebaseAuth db;
    FirebaseDatabase fd;
    DatabaseReference database_ref;
View v;
    Snackbar sb,sb2;
    String msg1="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("User Registration");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.emailtf);
        pass = findViewById(R.id.passtf);
        name=findViewById(R.id.nametf);
        roll=findViewById(R.id.rolltf2);
        sem=findViewById(R.id.semtf);
        db = FirebaseAuth.getInstance();
        v=findViewById(R.id.user_register_layout);



    }

    public void register(View view) {//on click method of 'register' button


           db.createUserWithEmailAndPassword(email.getText().toString().trim(),
                   pass.getText().toString().trim()).
                   addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                           if (task.isSuccessful()) {

                               msg1="User";

                               }
                            else if (task.isCanceled()){
                               msg1 = "Details";
                           }

                       }
                   });

           addUserData();
       }





    public void addUserData()   //method to add user add to database (separate than authentication)
    {
        fd = FirebaseDatabase.getInstance();
        database_ref=fd.getReference();
        User u=new User(name.getText().toString(),sem.getText().toString()
                            ,roll.getText().toString(),email.getText().toString(),pass.getText().toString());
        String key=database_ref.child("Users").push().getKey();
        database_ref.child("Users").child(key).setValue(u)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
        @Override
        public void onSuccess(Void aVoid) {

            sb=Snackbar.make(v,(msg1+" Registered !"),Snackbar.LENGTH_LONG);
            sb.show();
        }
    }).addOnFailureListener(new OnFailureListener() {
        @Override
        public void onFailure(@NonNull Exception e) {
           sb2=Snackbar.make(v,(msg1+"not Registered !"),Snackbar.LENGTH_LONG);
            sb2.show();}
    });
}}

