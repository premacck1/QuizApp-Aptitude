package com.prembros.aptitude.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

public class Leaderboard extends Fragment {

    public static boolean isFragmentActive = false;
//    private OnFragmentInteractionListener mListener;
    public static View rootView;

    public Leaderboard() {
        // Required empty public constructor
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Leaderboard.
     */
    public static Leaderboard newInstance() {
        return new Leaderboard();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_leaderboard, container, false);
//        CustomTextViewLight arithmeticReasoning = (CustomTextViewLight) rootView.findViewById(R.id.leaderboard_arithmetic_reasoning);
//        CustomTextViewLight logicalWordSequence = (CustomTextViewLight) rootView.findViewById(R.id.leaderboard_logical_word_sequence);
//        CustomTextViewLight bloodRelations = (CustomTextViewLight) rootView.findViewById(R.id.leaderboard_blood_relations);
//        CustomTextViewLight seriesCompletion = (CustomTextViewLight) rootView.findViewById(R.id.leaderboard_series_completion);
//        CustomTextViewLight analogy = (CustomTextViewLight) rootView.findViewById(R.id.leaderboard_analogy);
        rootView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fragment_anim_in));
        isFragmentActive = true;
        rootView.findViewById(R.id.leaderboard_list_item_container);

//        arithmeticReasoning.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mListener.onFragmentInteraction(0);
//            }
//        });
//        logicalWordSequence.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mListener.onFragmentInteraction(1);
//            }
//        });
//        bloodRelations.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mListener.onFragmentInteraction(2);
//            }
//        });
//        seriesCompletion.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mListener.onFragmentInteraction(3);
//            }
//        });
//        analogy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mListener.onFragmentInteraction(4);
//            }
//        });

        return rootView;
    }

//    public interface OnFragmentInteractionListener {
//        void onFragmentInteraction(int resultCode);
//    }
}