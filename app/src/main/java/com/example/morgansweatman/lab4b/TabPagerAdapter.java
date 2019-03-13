package com.example.morgansweatman.lab4b;

import android.support.v4.app.*;

public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FahrenheitToCelsiusConverterFragment();
            case 1: return new MilesToKilometersConverterFragment();
            case 2: return new TipCalculatorFragment();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}
