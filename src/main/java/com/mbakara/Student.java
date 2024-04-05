package com.mbakara;

/**
This class is responsible for keeping the track of students
 fees, name, grade & fess paid.
 */

public class Student {

    // Declaring the fields:
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*
    after defining the fields, you create a constructor, the role of a constructor is to create a new student object by
    initializing the values.
     */

    public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 150000; // this is how you create new student objects
    }

    // Not going to alter students name and students id.

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void updateFeesPaid(int fees){

    }
}
