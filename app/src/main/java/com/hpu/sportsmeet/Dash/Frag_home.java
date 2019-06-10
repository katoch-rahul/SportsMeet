package com.hpu.sportsmeet.Dash;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hpu.sportsmeet.R;

public class Frag_home extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //set title of activity
        ((MainMenu) getActivity()).setbartitle("Home");
        return inflater.inflate(R.layout.fragment_home, null);
    }
}
