package com.epicodus.photogallery.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.photogallery.R;
import com.epicodus.photogallery.fragment.BirdFragment;

/**
 * Created by YHoP on 10/22/15.
 */
public class BirdPageAdaptor extends FragmentPagerAdapter{

    String [] birds;


    public BirdPageAdaptor(FragmentManager fm, Context context) {
        super(fm);

        Resources resources = context.getResources();
        birds = resources.getStringArray(R.array.birds);
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();
        bundle.putInt(BirdFragment.ImageIDKey, getBirdImageId(position));

        BirdFragment birdFragment = new BirdFragment();
        birdFragment.setArguments(bundle);

        return birdFragment;
    }

    private int getBirdImageId(int position){
        int id = 0;
        switch (position){
            case 0:
                id = R.drawable.bird0;
                break;
            case 1:
                id = R.drawable.bird1;
                break;
            case 2:
                id = R.drawable.bird2;
                break;
            case 3:
                id = R.drawable.bird3;
                break;
            case 4:
                id = R.drawable.bird4;
                break;
        }

        return id;
    }


    @Override
    public int getCount() {
        return birds.length;
    }
}
