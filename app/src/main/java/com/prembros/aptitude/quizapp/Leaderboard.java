package com.prembros.aptitude.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

public class Leaderboard extends Fragment {

    public static boolean isFragmentActive = false;
    public View rootView;

    public Leaderboard() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_leaderboard, container, false);
        rootView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fragment_anim_in));
        isFragmentActive = true;
        rootView.findViewById(R.id.leaderboard_list_item_container);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        isFragmentActive = false;
        super.onDestroyView();
    }
}