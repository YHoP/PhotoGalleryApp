package com.epicodus.photogallery.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.photogallery.fragment.PuppyFragment;
import com.epicodus.photogallery.R;

/**
 * Created by YHoP on 10/22/15.
 */
public class PuppyPageAdaptor extends FragmentPagerAdapter{

    String [] puppies;


    public PuppyPageAdaptor(FragmentManager fm, Context context) {
        super(fm);

        Resources resources = context.getResources();
        puppies = resources.getStringArray(R.array.puppies);
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();
        bundle.putInt(PuppyFragment.ImageIDKey, getPuppyImageId(position));

        PuppyFragment puppyFragment = new PuppyFragment();
        puppyFragment.setArguments(bundle);

        return puppyFragment;
    }

    private int getPuppyImageId(int position){
        int id = 0;
        switch (position){
            case 0:
                id = R.drawable.puppy0;
                break;
            case 1:
                id = R.drawable.puppy1;
                break;
            case 2:
                id = R.drawable.puppy2;
                break;
            case 3:
                id = R.drawable.puppy3;
                break;
            case 4:
                id = R.drawable.puppy4;
                break;
        }

        return id;
    }


    @Override
    public int getCount() {
        return puppies.length;
    }
}
