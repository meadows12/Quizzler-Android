package com.londonappbrewery.quizzler;

public class TrueFalse {
    private int mQuestionid;
    private boolean mAnswer;

    public TrueFalse(int questionresourceid, boolean TrueorFalse){
        mQuestionid = questionresourceid;
        mAnswer = TrueorFalse;


    }

    public int getQuestionid() {
        return mQuestionid;
    }

    public void setQuestionid(int questionid) {
        mQuestionid = questionid;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
