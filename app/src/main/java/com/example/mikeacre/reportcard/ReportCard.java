package com.example.mikeacre.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mikeacre on 11/6/2016.
 */

public class ReportCard extends AppCompatActivity {

    String studentFirst;
    String studentLast;
    //Grades will be stored in a array list with a string for the subject and an int for the grade.
    //future version will also store a student ID to store info for multiple students
    ArrayList<AllGrades> storeGrades = new ArrayList<AllGrades>();

    private void generateSubjects(){
        //Creates all classes into the array list with grade of 0
        //this will allow for an easy addition or removal of subject
    }


    private void changeGrade(String subject, int grade){
        //Finds ArrayList with the correct subject and changes the grade

    }

    private int getGrade(String subject){
        //Finds object contianign proper grate and returns value
    }

    private char toLetter(int grade){
        //Converts number grade to letter for final display

    }

    private void setName(String first, String last){
        //sets name

    }

    private String dispName(){
        //returns a strign of the students full name
    }

    private TextView showGrade(String subject){
        //returns a text view containing the subject and letter grade
    }
}
