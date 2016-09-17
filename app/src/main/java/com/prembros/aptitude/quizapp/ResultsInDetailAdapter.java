package com.prembros.aptitude.quizapp;

/*
 * Created by Prem $ on 7/2/2016.
 */

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class ResultsInDetailAdapter extends BaseAdapter {

    private Context _context;
    private List<String> resultHeader;
    private List<String> resultChild;

    public ResultsInDetailAdapter(Context context, List<String> header, List<String> child) {
        this._context = context;
        resultHeader = header;
        resultChild = child;
    }

    @Override
    public int getCount() {
        return resultHeader.size() & resultChild.size();
    }

    @Override
    public Object getItem(int position) {
        return resultHeader.get(position) + " : " + resultChild.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomTextViewSemiLight result_question;
        CustomTextViewLight result_answer;

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.result_list_item, null);
        }

        result_question = (CustomTextViewSemiLight) convertView.findViewById(R.id.result_header_textView);
        if (result_question != null) {
            result_question.setText(resultHeader.get(position));
        }

        result_answer = (CustomTextViewLight) convertView.findViewById(R.id.result_child_textView);
        if (result_answer != null) {
            result_answer.setText(resultChild.get(position));
        }

        return convertView;
    }
}