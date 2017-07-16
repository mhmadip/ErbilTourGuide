package com.example.android.erbiltourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by AD4 on 7/29/2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WalkingFragment();
        } else if (position == 1) {
            return new ShoppingFragment();
        } else if (position == 2) {
            return new EntertainmentFragment();
        } else if (position == 3) {
            return new DiningFragment();
        } else {
            return new LocationFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return tabTitles[position];
        if (position == 0) {
            return mContext.getString(R.string.category_walking);
        } else if (position == 1) {
            return mContext.getString(R.string.category_shopping);
        } else if (position == 2) {
            return mContext.getString(R.string.category_entertainment);
        } else if (position == 3) {
            return mContext.getString(R.string.category_dining);
        } else {
            return mContext.getString(R.string.category_location);
        }

    }
}

