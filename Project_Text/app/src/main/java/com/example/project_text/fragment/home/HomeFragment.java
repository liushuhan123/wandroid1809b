package com.example.project_text.fragment.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mylibrary.JBanner;
import com.example.mylibrary.JBannerAdapter;
import com.example.project_text.R;
import com.example.project_text.base.BaseFragment;
import com.example.project_text.data.entity.Banner;
import com.example.project_text.view.GlideApp;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment {


    private static final String TAG = "HomeFragment";
    private JBanner mJBanner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View inflate = inflater.inflate(R.layout.fragment_home, container, false);


        mJBanner = inflate.findViewById(R.id.home_ban);

        List<Banner> banners = Banner.getBanners();
        mJBanner.setLoop(banners.size() > 1);

        ArrayList titles = new ArrayList();

        for (Banner banner : banners) {
            Log.d(TAG, "onCreateView: " + banner.getTitle());
            Log.d(TAG, "onCreateView: " + banner.getImgUrl());

            titles.add(banner.getTitle());
        }
        mJBanner.setDatas(banners, titles);


        mJBanner.setAdapter(new JBannerAdapter<Banner>() {
            @Override
            public void fillBannerItemData(JBanner banner, ImageView imageView, Banner mode, int position) {
                GlideApp.with(banner.getContext()).load(mode.getImgUrl()).into(imageView);


            }

        });


        return inflate;
    }

}
