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


public class FirstFragment extends Fragment {

    ImageView imageView;
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        imageView=view.findViewById(R.id.imagenFirst);
        Picasso.get().load("https://i.imgur.com/T41pEcE.jpg").error(R.drawable.ic_launcher_foreground).placeholder(R.drawable.ic_launcher_background).fit().into(imageView);
        return view;
    }

}
