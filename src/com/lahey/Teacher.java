package com.lahey;

public class Teacher extends Person {


//    private ArrayList<Course> coursesTaught;

    /**
     * default constructor
     */
     public Teacher() {
//        coursesTaught = new ArrayList<Course>();
     }

    /**
     *
     * @param idNumber
     * @param firstName
     * @param lastName
     */
     public Teacher(String idNumber, String firstName, String lastName, String emailAddress){
        this.setIdNumber(idNumber);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(emailAddress);
//        coursesTaught = new ArrayList<>();
     }

    /**
     *
     * @return
     */
//    public ArrayList<Course> getCoursesTaught() {
//        return coursesTaught;
//    }

    /**
     *
     * @param coursesTaught
     */
//    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
//        this.coursesTaught = coursesTaught;
//    }

    /**
     *
     * @param theCourse
     */
//    public void addACourse(Course theCourse)
//    {
//        coursesTaught.add(theCourse);
//    }

}
