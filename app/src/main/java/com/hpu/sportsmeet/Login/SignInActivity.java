package com.hpu.sportsmeet.Login;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.hpu.sportsmeet.Dash.MainMenu;
import com.hpu.sportsmeet.R;


public class SignInActivity extends AppCompatActivity {
    private FirebaseAuth db;
    EditText ut,pt;
    
    ConstraintLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        super.setTitle("Sign In");
        setContentView(R.layout.activity_sign_in);
        l=findViewById(R.id.were);

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
        Intent i=new Intent(this, MainMenu.class);
        startActivity(i);
    }
    public void denied()        //wrong password or sth
    {
        Snackbar sb1=Snackbar.make(l," Wrong Username or Password",
                Snackbar.LENGTH_LONG );
        sb1.show();    }
}
