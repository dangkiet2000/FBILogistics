package com.example.demoapp.fragment_pro;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.demoapp.R;
import com.example.demoapp.slide_image.DepthPageTransformer;
import com.example.demoapp.slide_image.Photo;
import com.example.demoapp.slide_image.PhotoViewPager2Adapter;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class HomeFragment extends Fragment {
    private ViewPager2 mViewPager2;
    private CircleIndicator3 mCircleIndicator3;
    private List<Photo> mListPhoto;

    // auto scroll
    private Handler mHandler = new Handler();
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            if (mViewPager2.getCurrentItem() == mListPhoto.size() - 1) {
                mViewPager2.setCurrentItem(0);
            } else {
                mViewPager2.setCurrentItem(mViewPager2.getCurrentItem() + 1);
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mViewPager2 = (ViewPager2) view.findViewById(R.id.view_pager_2);
        mCircleIndicator3 = (CircleIndicator3) view.findViewById(R.id.circle_indicator_3);

        mListPhoto = getListPhoto();

        PhotoViewPager2Adapter adapter = new PhotoViewPager2Adapter(mListPhoto);

        mViewPager2.setAdapter(adapter);
        mCircleIndicator3.setViewPager(mViewPager2);

        mViewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                mHandler.removeCallbacks(mRunnable);
                mHandler.postDelayed(mRunnable, 4000);
            }
        });
        mViewPager2.setPageTransformer(new DepthPageTransformer());

        return view;
    }

    private List<Photo> getListPhoto() {
        List<Photo> list = new ArrayList<>();

        list.add(new Photo(R.drawable.homefbi_home0));
        list.add(new Photo(R.drawable.homefbi_home1));
        list.add(new Photo(R.drawable.homefbi_home2));
        list.add(new Photo(R.drawable.homefbi_home3));
        list.add(new Photo(R.drawable.homefbi_home4));

        return list;
    }

    @Override
    public void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mRunnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        mHandler.postDelayed(mRunnable, 4000);
    }
}

