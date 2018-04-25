package com.example.android.madridexcursion;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ItineraryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ItineraryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        } else if (position == 1) {
            return new TuesdayFragment();
        } else if (position == 2) {
            return new WednesdayFragment();
        } else {
            return new ThursdayFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.day_one);
        } else if (position == 1) {
            return mContext.getString(R.string.day_two);
        } else if (position == 2) {
            return mContext.getString(R.string.day_three);
        } else {
            return mContext.getString(R.string.day_four);
        }
    }
}
