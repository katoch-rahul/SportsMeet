package com.hpu.sportsmeet.Games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.hpu.sportsmeet.R;

public class VB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vb);

        Toolbar toolbar =findViewById(R.id.toolbar_vb);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {

    }
    public void Killer(View view)
    {
        Intent i=new Intent(this, RegistrationVB.class);
        startActivity(i);
    }
}
