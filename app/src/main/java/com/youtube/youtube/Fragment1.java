package com.youtube.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.youtube.youtube.R.layout.fragment1;
/**
 * Created by ehdql on 2017-07-27.
 */

public class Fragment1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(fragment1, container, false);


        return rootView;

    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getView().findViewById(R.id.buttonLogin).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getContext().getApplicationContext(),
                        LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}
