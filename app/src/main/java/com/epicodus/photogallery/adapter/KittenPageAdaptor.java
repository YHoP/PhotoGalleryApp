package com.epicodus.photogallery.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.photogallery.R;
import com.epicodus.photogallery.fragment.KittenFragment;

/**
 * Created by YHoP on 10/22/15.
 */
public class KittenPageAdaptor extends FragmentPagerAdapter{

    String [] kittens;


    public KittenPageAdaptor(FragmentManager fm, Context context) {
        super(fm);

        Resources resources = context.getResources();
        kittens = resources.getStringArray(R.array.kittens);
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();
        bundle.putInt(KittenFragment.ImageIDKey, getKittenImageId(position));

        KittenFragment kittenFragment = new KittenFragment();
        kittenFragment.setArguments(bundle);

        return kittenFragment;
    }

    private int getKittenImageId(int position){
        int id = 0;
        switch (position){
            case 0:
                id = R.drawable.kitten0;
                break;
            case 1:
                id = R.drawable.kitten1;
                break;
            case 2:
                id = R.drawable.kitten2;
                break;
            case 3:
                id = R.drawable.kitten3;
                break;
            case 4:
                id = R.drawable.kitten4;
                break;
        }

        return id;
    }


    @Override
    public int getCount() {
        return kittens.length;
    }
}
