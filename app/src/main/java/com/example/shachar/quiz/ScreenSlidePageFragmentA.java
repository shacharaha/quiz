package com.example.shachar.quiz;

/**
 * Created by Shachar on 12/21/2015.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScreenSlidePageFragmentA extends Fragment {


    TextView tv ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
       tv = (TextView)rootView.findViewById(R.id.text_view);
        tv.setText("fragment a");
        return rootView;
    }
}