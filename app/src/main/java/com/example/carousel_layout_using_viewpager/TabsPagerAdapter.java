package com.example.carousel_layout_using_viewpager;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    private int NUM_ITEMS = 3;
    private String[] titles= new String[]{"First Fragment", "Second Fragment","Third Fragment"};

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return  NUM_ITEMS ;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return  titles[position];
    }

}
