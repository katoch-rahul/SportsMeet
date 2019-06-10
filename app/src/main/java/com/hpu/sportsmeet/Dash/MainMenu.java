package com.hpu.sportsmeet.Dash;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.hpu.sportsmeet.R;

public class MainMenu extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(this);
        loadMethod(new Frag_home());
    }
    public void setbartitle(String title)                   //to change title in fragments
    {
        getSupportActionBar().setTitle(title);
    }
    private boolean loadMethod(Fragment fr)
    {
        if(fr != null)
        {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frag_layout, fr)
                    .commit();

            return true;
        }
            return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment frag = null;

        switch(item.getItemId())
        {
            case(R.id.navigation_home):
                frag=new Frag_home();
                break;
            case(R.id.navigation_dashboard):
                frag=new Frag_dash();
                break;
            case(R.id.navigation_notifications):
                frag=new Frag_noti();
                break;


        }

        return loadMethod(frag);
    }
}
