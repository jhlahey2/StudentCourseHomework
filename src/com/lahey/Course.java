package com.lahey;

import java.util.ArrayList;

public class Course {

    private String idNumber = "";
    private String courseName = "";
    private ArrayList<Student> studentsTakingThisCourse;
    private ArrayList<Teacher> teachersForThisCourse;


    public ArrayList<Student> getStudentsTakingThisCourse() {
        return studentsTakingThisCourse;
    }

    public ArrayList<Teacher> getTeachersForThisCourse() {
        return teachersForThisCourse;
    }

    /**
     * default constructor constructs ArrayList of Students and ArrayList of Teachers
     */
    public Course() {

        studentsTakingThisCourse = new ArrayList<>();
        teachersForThisCourse = new ArrayList<>();
    }

    /**
     * Overlaaded constructor
     *
     * @param idNumber
     * @param courseName
     */
    public Course(String idNumber, String courseName) {
        this.idNumber = idNumber;
        this.courseName = courseName;
        studentsTakingThisCourse = new ArrayList<>();
        teachersForThisCourse = new ArrayList<>();
    }

    /**
     * get idNumber
     * @return id number
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * set idNumber
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * get course name
     * @return course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * get course name
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student){

        studentsTakingThisCourse.add(student);

    }
    public void addTeacher(Teacher teacher){

        teachersForThisCourse.add(teacher);

    }
}
