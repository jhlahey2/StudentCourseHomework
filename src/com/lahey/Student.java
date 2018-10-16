package com.lahey;

public class Student extends Person
{
//    private List<Course> coursesTaken;

    /**
     * default constructor
     */
    public Student() {
//        coursesTaken = new ArrayList <Course>();

    }

    /**
     *overloaded constructor
     *
     * @param idNumber
     * @param firstName
     * @param lastName
     * @param emailAddress
     */
    public Student(String idNumber, String firstName, String lastName, String emailAddress)
    {
        this.setIdNumber(idNumber);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(emailAddress);
//        coursesTaken = new ArrayList<>();
    }

    /**
     *
     * @return
     */
//    public List<Course> getCoursesTaken() {
//        return coursesTaken;
//    }

//    public void setCoursesTaken(List<Course> coursesTaken) {
//        this.coursesTaken = coursesTaken;
//    }

    /**
     * adds a course to
     * @param existingCourse
     */
//    public void addACourse(Course existingCourse)
//    {
//        coursesTaken.add(existingCourse);
//    }
}
