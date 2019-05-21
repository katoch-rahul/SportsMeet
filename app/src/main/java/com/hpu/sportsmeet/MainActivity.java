package com.hpu.sportsmeet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void signin(View view)
    {
        Intent i=new Intent(this, SignInActivity.class);
        startActivity(i);
    }
}
