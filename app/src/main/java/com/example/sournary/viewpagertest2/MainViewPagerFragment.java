package com.example.sournary.viewpagertest2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by sournary on 03/07/2017.
 */

public class MainViewPagerFragment extends Fragment {

    public static final String NUM_PAGER = "page";
    private int[] images = {R.drawable.bad_smelly, R.drawable.boss,
            R.drawable.khoc, R.drawable.presence_offline,
            R.drawable.too_sad, R.drawable.what};
    private int mPageNumber;

    public MainViewPagerFragment() {
    }

    public static MainViewPagerFragment createMainViewPagerFragment(int page) {
        MainViewPagerFragment fragment = new MainViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(NUM_PAGER, page);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(NUM_PAGER);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_view_pager, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_view_pager);
        imageView.setImageResource(images[mPageNumber]);

        return view;
    }

}
