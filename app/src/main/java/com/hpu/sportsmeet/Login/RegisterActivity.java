package com.hpu.sportsmeet.Login;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.hpu.sportsmeet.R;

public class RegisterActivity extends AppCompatActivity {
    EditText name, email, roll, pass, sem;
    FirebaseAuth db;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("Register");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.emailtf);
        pass = findViewById(R.id.passtf);
        name=findViewById(R.id.nametf);
        roll=findViewById(R.id.semtf);
        sem=findViewById(R.id.semtf);
        db = FirebaseAuth.getInstance();


    }

    public void register(View view) {

       try {
           db.createUserWithEmailAndPassword(email.getText().toString().trim(),
                   pass.getText().toString().trim()).
                   addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                           if (task.isSuccessful()) {
                               done();
                           } else
                               notdone();


                       }
                   });
       }
       catch(Exception e)
       {
           notdone();
       }
    }

    public void done()      //registered successfully
    {
        Intent i = new Intent(this, RegisterAftermath.class);
        startActivity(i);
    }
    public void notdone()   //welllll not registered or some error
    {
        name.setText("");
        roll.setText("");
        email.setText("");
        pass.setText("");
        sem.setText("");
    }
}

