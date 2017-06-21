?package org.launchcode.java.prepwork.school;

/**
 * Created by Hackman on 6/12/2017.
 */
public class Student {
    private String name;
    private int studentID;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int aStudentID) {
        studentID = aStudentID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
