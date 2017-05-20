package com.example.android.miwok;

/**
 * Allows a school to store a student’s grades (4 subjects) for a particular year, in this case
 * 2017
 */

public class ReportCard {

    // Scholar year 2017
    public static final int SCHOLAR_YEAR = 2017;

    // Subjects
    private final String SUBJECT01 = "\nMath: ";
    private final String SUBJECT02 = "\nGeography: ";
    private final String SUBJECT03 = "\nEnglish: ";
    private final String SUBJECT04 = "\nProgramming: ";

    // Grades of curriculum subjects.
    private int mSubject01Grade, mSubject02Grade, mSubject03Grade, mSubject04Grade;

    // constructor which properly instantiates each variable in the class
    public ReportCard(int grade01, int grade02, int grade03, int grade04) {
        mSubject01Grade = grade01;
        mSubject02Grade = grade02;
        mSubject03Grade = grade03;
        mSubject04Grade = grade04;
    }

    /**
     * Setter methods for assigning grades to subjects
     *
     * @param grade the grade assigned to the given subject (1-5)
     */
    // Sets grade for Subject01
    public void setSubject01Grade(int grade) {
        mSubject01Grade = grade;
    }

    // Sets grade for Subject02
    public void setSubject02Grade(int grade) {
        mSubject02Grade = grade;
    }

    // Sets grade for Subject03
    public void setSubject03Grade(int grade) {
        mSubject03Grade = grade;
    }

    // Sets grade for Subject04
    public void setSubject04Grade(int grade) {
        mSubject04Grade = grade;
    }

    /**
     * Getter to access the scholar year.
     */
    public int getScholarYear() {
        return SCHOLAR_YEAR;
    }

    /**
     * Getter methods for accessing the name of a specific subject.
     *
     * @return
     */
    // Gets name of Subject01
    public String getSubject01() {
        return SUBJECT01;
    }

    // Gets name of Subject02
    public String getSubject02() {
        return SUBJECT02;
    }

    // Gets name of Subject03
    public String getSubject03() {
        return SUBJECT03;
    }

    // Gets name of Subject04
    public String getSubject04() {
        return SUBJECT04;
    }

    /**
     * Getter methods for accessing the grade of a specific subject.
     *
     * @return
     */
    // Gets grade of Subject01
    public int getSubject01Grade() {
        return mSubject01Grade;
    }

    // Gets grade of Subject02
    public int getSubject02Grade() {
        return mSubject02Grade;
    }

    // Gets grade of Subject03
    public int getSubject03Grade() {
        return mSubject03Grade;
    }

    // Gets grade of Subject04
    public int getSubject04Grade() {
        return mSubject04Grade;
    }


    /**
     * returns the contents of the class in a human-readable string
     */
    public String toString() {
        return SCHOLAR_YEAR +
                SUBJECT01 + mSubject01Grade +
                SUBJECT02 + mSubject02Grade +
                SUBJECT03 + mSubject03Grade +
                SUBJECT04 + mSubject04Grade;
    }
}
