package com.example.worldskills.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class ThirdFragment extends Fragment {

    private ImageView imageView;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_third, container, false);
        imageView=view.findViewById(R.id.imagenThird);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").error(R.drawable.ic_launcher_foreground).placeholder(R.drawable.ic_launcher_background).fit().into(imageView);
        return view;
    }



}
