package com.example.android.egypttourgide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Created by MohamedAshiba on 28/9/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;


    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TourismFragment();
            case 1:
                return new MosquesFragment();
            case 2:
                return new ParksFragment();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_tourism);
            case 1:
                return mContext.getString(R.string.category_mosques);
            case 2:
                return mContext.getString(R.string.category_parks);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
