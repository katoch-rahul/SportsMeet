package com.hpu.sportsmeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterAftermath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTitle("Register");
        setContentView(R.layout.activity_register_aftermath);

    }
    public void onClickYES(View view)
    {
        Intent i=new Intent(this, SignInActivity.class);
        startActivity(i);
    }
    public void onClickNO(View view)
        {
            Intent i=new Intent(this, MainActivity.class);
            startActivity(i);
        }
}
