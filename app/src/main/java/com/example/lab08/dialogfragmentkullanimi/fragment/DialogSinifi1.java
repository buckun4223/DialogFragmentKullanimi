package com.example.lab08.dialogfragmentkullanimi.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab08.dialogfragmentkullanimi.R;
import com.example.lab08.dialogfragmentkullanimi.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DialogSinifi1 extends DialogFragment {

    ViewPagerAdapter adapter;
    List<Fragment> fragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.viewpagerdialog_layout,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ViewPager viewPager = view.findViewById(R.id.viewpager);
        fragment = new ArrayList<>();
        fragment.add(new FragmentLayout1());
        fragment.add(new FragmentLayout2());
        adapter = new ViewPagerAdapter(getChildFragmentManager(),fragment);
        viewPager.setAdapter(adapter);

    }
}
