package com.hpu.sportsmeet.Dash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hpu.sportsmeet.Games.TT;
import com.hpu.sportsmeet.Login.RegisterActivity;
import com.hpu.sportsmeet.MainActivity;
import com.hpu.sportsmeet.R;


public class Frag_noti extends Fragment{

    private CardView newUser,logout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_notification,container,false);
        ((MainMenu) getActivity()).setbartitle("Options");

        newUser = (CardView) v.findViewById(R.id.new_user);
        logout = (CardView) v.findViewById(R.id.logout);

        newUser.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), RegisterActivity.class);
                    }
                });

        logout.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), MainActivity.class);
                    }
                });

        return v;

    }

    public void startstuff(Activity a1, Class c)
    {

        Intent i=new Intent(a1,c);
        startActivity(i);
    }
}
