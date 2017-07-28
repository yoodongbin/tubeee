package com.youtube.youtube;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.youtube.youtube.R.layout.fragment1;

/**
 * Created by ehdql on 2017-07-27.
 */

public class Fragment1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(fragment1, container, false);

        return rootView;


    }


}
