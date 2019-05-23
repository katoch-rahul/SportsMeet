package com.hpu.sportsmeet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class SignInActivity extends AppCompatActivity {
    private FirebaseAuth db;
    EditText ut,pt;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        super.setTitle("Sign In");
        setContentView(R.layout.activity_sign_in);


        ut=(EditText)findViewById(R.id.ut);
        pt=(EditText)findViewById(R.id.password);


        db=FirebaseAuth.getInstance();

    }




    public void onClick(View view)
    {
        String email=ut.getText().toString().trim();
        String password=pt.getText().toString().trim();
        db.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            granted();
                        }
                        else
                            denied();
                    }
                });
    }

    public void forgot(View view)
    {
        Intent i=new Intent(this, ForgotPassword.class);
        startActivity(i);
    }
    public void granted()       //signed in successfully
    {
        Intent i=new Intent(this, Menuu.class);
        startActivity(i);
    }
    public void denied()        //wrong password or sth
    {
        ut.setText("Wrong Username or Password");
    }
}
