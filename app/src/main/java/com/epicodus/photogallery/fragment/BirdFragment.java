package com.epicodus.photogallery.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.epicodus.photogallery.R;

/**
 * Created by YHoP on 10/22/15.
 */
public class BirdFragment extends android.support.v4.app.Fragment {

    public static final String ImageIDKey = "imagekey";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_bird, container, false);

        Bundle bundle = getArguments();

        if(bundle != null){
            int imageId = bundle.getInt(ImageIDKey);
            setValues(view, imageId);
        }

        return view;
    }

    private void setValues(View view, int imageId) {
        ImageView imageView = (ImageView) view.findViewById(R.id.birdsImage);
        imageView.setImageResource(imageId);
    }
}
