package com.hpu.sportsmeet;

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

public class Frag_dash extends Fragment {
    private CardView tt,bdm,voley,ckt,nba,soc,fifa,cs,go;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_dashboard,container,false);

        tt=(CardView) v.findViewById(R.id.tabletennis);      //finding view of objects for card views
        bdm=(CardView) v.findViewById(R.id.badminton);
        voley=(CardView) v.findViewById(R.id.volleyball);
        ckt=(CardView) v.findViewById(R.id.cricket);
        nba=(CardView) v.findViewById(R.id.nba);
        soc=(CardView) v.findViewById(R.id.football);
        fifa=(CardView) v.findViewById(R.id.fifa);
        cs=(CardView) v.findViewById(R.id.cs);
        go=(CardView) v.findViewById(R.id.go);


//setting onCLickListeners for all Card Views
         tt.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                    startstuff(getActivity(),MainActivity.class);
                    }
                });
        bdm.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        voley.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        ckt.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        nba.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        soc.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        fifa.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        cs.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });
        go.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(),MainActivity.class);
                    }
                });


        return v;
    }
    public void startstuff(Activity a1,Class c)
    {

        Intent i=new Intent(a1,c);
        startActivity(i);
    }
}
