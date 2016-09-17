package com.prembros.aptitude.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/*
* Created by Prem $ on 7/22/2016.
*/
public class Help extends Fragment {

    public static boolean isFragmentActive;
    public static View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.help, container, false);
        rootView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fragment_anim_in));
        String text = getString(R.string.help_want_more_features_content) + getString(R.string.get_pro_coming_soon);
        ((CustomTextViewLight) rootView.findViewById(R.id.more_features_content)).setText(text);
        CustomTextViewBlack getPro = (CustomTextViewBlack) rootView.findViewById(R.id.get_pro);
        getPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Prem+Bros")));
                } catch (android.content.ActivityNotFoundException e){
                    e.printStackTrace();
                    Toast.makeText(getContext(), "No app found for this action!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        isFragmentActive = true;
        return rootView;
    }
}