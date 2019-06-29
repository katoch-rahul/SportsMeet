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

import com.hpu.sportsmeet.Games.BB;
import com.hpu.sportsmeet.Games.BDM;
import com.hpu.sportsmeet.Games.CKT;
import com.hpu.sportsmeet.Games.CS;
import com.hpu.sportsmeet.Games.FB;
import com.hpu.sportsmeet.Games.FIFA;
import com.hpu.sportsmeet.Games.GO;
import com.hpu.sportsmeet.Games.RegistrationVB;
import com.hpu.sportsmeet.Games.VB;
import com.hpu.sportsmeet.MainActivity;
import com.hpu.sportsmeet.R;
import com.hpu.sportsmeet.Games.TT;

public class Frag_dash extends Fragment {
    private CardView tt,bdm,voley,ckt,nba,soc,fifa,cs,go;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_dashboard,container,false);
//set title of activity
        ((MainMenu) getActivity()).setbartitle("Dashboard");

        //finding view of objects for card views
        tt=(CardView) v.findViewById(R.id.tabletennis);
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
                    startstuff(getActivity(), TT.class);
                    }
                });
        bdm.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), BDM.class);
                    }
                });
        voley.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), VB.class);
                    }
                });
        ckt.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), CKT.class);
                    }
                });
        nba.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), BB.class);
                    }
                });
        soc.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), FB.class);
                    }
                });
        fifa.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), FIFA.class);
                    }
                });
        cs.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), CS.class);
                    }
                });
        go.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startstuff(getActivity(), GO.class);
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
