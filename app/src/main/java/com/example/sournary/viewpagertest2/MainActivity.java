package com.example.sournary.viewpagertest2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_PAGE = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlidePagerAdapter slidePagerAdapter = new SlidePagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.vp_main);
        viewPager.setAdapter(slidePagerAdapter);
    }

    private class SlidePagerAdapter extends FragmentStatePagerAdapter{

        public SlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return MainViewPagerFragment.createMainViewPagerFragment(position);
        }

        @Override
        public int getCount() {
            return NUM_PAGE;
        }
    }

}
