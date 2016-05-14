package com.quanh.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quanh.brbd.R;


/**
 * Created by Michael Nguyen on 5/14/2016.
 */
public class Fragment3 extends Fragment {
    public Fragment3(){}

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment3, container, false);
        return rootView;
    }
}
