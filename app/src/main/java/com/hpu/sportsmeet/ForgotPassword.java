package com.hpu.sportsmeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    EditText email;
    Button b;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        email=findViewById(R.id.email);
        b=findViewById(R.id.sss);
        show=findViewById(R.id.show);
        show.setVisibility(View.INVISIBLE);
    }
    public void recover(View view)
    {
        email.setVisibility(View.INVISIBLE);
        b.setVisibility(View.INVISIBLE);
        show.setVisibility(View.VISIBLE);
    }
}
