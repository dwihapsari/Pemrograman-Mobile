package com.hapsari.flexiblefragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Fragment Ketiga");
        ((MainActivity)getActivity()).getSupportActionBar().setSubtitle("(fragment_third.xml)");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);

    }

}
