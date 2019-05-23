package com.hpu.sportsmeet;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    EditText ut,pt;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        super.setTitle("Sign In");
        setContentView(R.layout.activity_sign_in);

        ut=(EditText)findViewById(R.id.username);
        pt=(EditText)findViewById(R.id.password);



    }

    public void onClick(View view)
    {
        SignInTable data=new SignInTable();

        data.setUsername("rahul");
        data.setPassword("root");

        if(pt.getText().toString()==data.getPassword().toString())
        {
            ut.setText("good");
        }
        else
            ut.setText("Not good");

    }
}
