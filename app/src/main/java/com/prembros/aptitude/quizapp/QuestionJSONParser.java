package com.prembros.aptitude.quizapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/*
 * Created by Prem $ on 7/4/2016.
 */
public class QuestionJSONParser extends ArrayList<QuestionBean> {

//    QuestionJSONParser (JSONObject jObject, String field, String section){
//        parse(jObject, field, section);
//    }

    /** Receives a JSONObject and returns a list */
    public ArrayList<QuestionBean> parse(JSONObject jObject, String field, String section){

        JSONArray jFieldArray;
        JSONArray jFinalArray = null;
        
        try {
            /** Retrieves all the elements in the 'field' array */
            jFieldArray = jObject.getJSONArray(field);
            int sectionIndex = getSectionIndex(section);
            JSONObject sectionObj = jFieldArray.getJSONObject(sectionIndex);
            jFinalArray = sectionObj.getJSONArray(section);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        /** Invoking getQuestions with the array of json object
         * where each json object represent a field
         */
        return getQuestions(jFinalArray,field,section);
    }

    public int getSectionIndex(String section){
        switch(section){
            case "Section 1":
                return 0;
            case "Section 2":
                return 1;
            case "Section 3":
                return 2;
            case "Section 4":
                return 3;
            case "Section 5":
                return 4;
            default:
                return -1;
        }
    }

    private ArrayList<QuestionBean> getQuestions(JSONArray jQuestions,String field,String section){
        
        int questionCount = jQuestions.length();
        ArrayList<QuestionBean> fieldList = new ArrayList<>();
        QuestionBean question;

        /** Taking each question, parses and adds to list object */
        for(int i=0; i<questionCount; i++){
            try {
                /** Call getQuestion with question JSON object to parse the question */
                question = getQuestion((JSONObject)jQuestions.get(i),field,section);
                fieldList.add(question);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return fieldList;
    }

    /** Parsing the Question JSON object */
    private QuestionBean getQuestion(JSONObject jQuestion, String d, String section){

        QuestionBean field = new QuestionBean();
        String diff, question, opt1, opt2, opt3, opt4, ans;

        try {
            diff = section;
            question = jQuestion.getString("question");
            opt1 = jQuestion.getString("opt1");
            opt2 = jQuestion.getString("opt2");
            opt3 = jQuestion.getString("opt3");
            opt4 = jQuestion.getString("opt4");
            ans =  jQuestion.getString("ans");

            field.setSection(diff);
            field.setQuestion(question);
            field.setOption1(opt1);
            field.setOption2(opt2);
            field.setOption3(opt3);
            field.setOption4(opt4);
            field.setAnswer(ans);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return field;
    }
}