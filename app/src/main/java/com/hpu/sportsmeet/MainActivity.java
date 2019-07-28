package com.hpu.sportsmeet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import com.hpu.sportsmeet.Dash.MainMenu;
import com.hpu.sportsmeet.Login.RegisterActivity;
import com.hpu.sportsmeet.Login.SignInActivity;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void openSignin(View view)
    {
        Intent i=new Intent(this, SignInActivity.class);
        Intent j=new Intent(this, MainMenu.class);

        startActivity(i);

    }

    public void openRegister(View view)
    {
        Intent j=new Intent(this, RegisterActivity.class);
                startActivity(j);
    }
}
