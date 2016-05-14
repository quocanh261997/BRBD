package com.quanh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quanh.brbd.R;

/**
 * Created by Michael Nguyen on 5/14/2016.
 */
public class Fragment1 extends Fragment {
    public Fragment1(){}

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.home_activity, container, false);
        return rootView;
    }
}
