package com.youtube.youtube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import static com.youtube.youtube.R.layout.fragment3;

/**
 * Created by ehdql on 2017-07-27.
 */

public class Fragment3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(fragment3, container, false);

        return rootView;
    }
}
