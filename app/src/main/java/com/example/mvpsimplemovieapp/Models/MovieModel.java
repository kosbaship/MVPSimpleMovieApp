package com.example.mvpsimplemovieapp.Models;

public class MovieModel {
//    TODO (2)
//    اعمل المودل بالداتا اللي انت محدد انها هتتعرض علي الشاشه
    int _ID;
    String mMoviewName, mMoviewDate, mMoviewDescription;

    public MovieModel() {
    }

    public MovieModel(int _ID, String mMoviewName, String mMoviewDate, String mMoviewDescription) {
        this._ID = _ID;
        this.mMoviewName = mMoviewName;
        this.mMoviewDate = mMoviewDate;
        this.mMoviewDescription = mMoviewDescription;
    }


    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getmMoviewName() {
        return mMoviewName;
    }

    public void setmMoviewName(String mMoviewName) {
        this.mMoviewName = mMoviewName;
    }

    public String getmMoviewDate() {
        return mMoviewDate;
    }

    public void setmMoviewDate(String mMoviewDate) {
        this.mMoviewDate = mMoviewDate;
    }

    public String getmMoviewDescription() {
        return mMoviewDescription;
    }

    public void setmMoviewDescription(String mMoviewDescription) {
        this.mMoviewDescription = mMoviewDescription;
    }
}
