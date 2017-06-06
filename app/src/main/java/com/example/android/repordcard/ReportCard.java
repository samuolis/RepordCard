package com.example.android.repordcard;

/**
 * Created by Lukas on 2017-06-06.
 */

public class ReportCard {

    //Student number in system
    private int mStudentNumber;
    //Student name and lastaname
    private String mStudentName;
    //Fields for specific lesson grade
    private int mEnglish;
    private int mMaths;
    private int mPhysics;
    private int mChemistry;
    private int mHistory;
    private int mGeography;

    /**
     * Create a new ReportCard object.
     *
     * @param studentNumber        is the number in system of the student.
     * @param studentName          is the first name and last name of the student.
     * @param english              is student's grade in English.
     * @param maths                is student's grade in Mathematics.
     * @param physics              is student's grade in Physics.
     * @param chemistry            is student's grade in Chemistry.
     * @param history              is student's grade in History.
     * @param geography            is student's grade in Geography.
     */


    public ReportCard(int studentNumber, String studentName, int english, int maths, int physics, int chemistry, int history, int geography) {
        mStudentNumber = studentNumber;
        mStudentName = studentName;
        mEnglish=english;
        mMaths = maths;
        mPhysics=physics;
        mChemistry = chemistry;
        mHistory = history;
        mGeography=geography;
    }

    // get and set methods for Student Number
    public int getStudentNumber(){return mStudentNumber;}
    public void setStudentNumber(int studentNumber){mStudentNumber=studentNumber;}

    // get and set methods for Student Name
    public String getStudentName(){return mStudentName;}
    public void setStudentName(String studentName){mStudentName=studentName;}

    // get and set methods for English grade
    public int getEnglish() {return mEnglish;}
    public void setEnglish(int english) {mEnglish = english;}

    // get and set methods for Maths grade
    public int getMaths() {return mMaths;}
    public void setMaths(int maths) {mMaths = maths;}

    // get and set methods for Physics grade
    public int getPhysics() {return mPhysics;}
    public void setPhysics(int physics) {mPhysics = physics;}

    // get and set methods for Chemistry grade
    public int getChemistry() {return mChemistry;}
    public void setChemistry(int chemistry) {mChemistry = chemistry;}

    // get and set methods for History grade
    public int getHistory() {return mHistory;}
    public void setHistory(int History) {mHistory = History;}

    // get and set methods for Geography grade
    public int getGeography() {return mGeography;}
    public void setGeography(int geography) {mGeography = geography;}

    @Override
    public String toString() {
        return "Student{ " +
                "\nNumber: " + mStudentNumber +
                "\nName: " + mStudentName +
                "\nGrade in English: " + mEnglish+
                "\nGrade in Mathematics: " + mMaths +
                "\nGrade in Physics: " + mPhysics +
                "\nGrade in Chemistry: " + mChemistry +
                "\nGrade in History: " + mHistory +
                "\nGrade in Geography: " + mGeography +" }";

    }

}
