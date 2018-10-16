package com.lahey;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Teacher> allTeachers = new ArrayList<>();
        ArrayList<Course> allCourses = new ArrayList<>();

        allCourses.add(new Course("123456", "Mathematics"));
        allCourses.add(new Course("23456", "Biology"));

        Teacher aTeacher = new Teacher("123456", "Dave", "Wolf", "dave@wolf.com");
//        aTeacher.getCoursesTaught().add(findCourseById("123456", allCourses));
        allTeachers.add(aTeacher);

        aTeacher = new Teacher("123457", "Another", "Teacher", "another@teacher.com");
//        aTeacher.getCoursesTaught().add(findCourseById("23456", allCourses));
        allTeachers.add(aTeacher);

        Student aStudent = new Student("123456", "Joyce", "Luning", "email@email.com");
        allStudents.add(aStudent);

        aStudent = new Student("123458", "Sarah", "Smith", "otheremail@email.com");
        allStudents.add(aStudent);

        aStudent = findStudent("123458", allStudents);
        System.out.printf("The student's ID Number %s the student's first name: %s\n", aStudent.getIdNumber(), aStudent.getFirstName());

        aTeacher = findTeacher("123457", allTeachers);

        System.out.printf("The teacher's ID Number %s the teachers's first name: %s\n", aTeacher.getIdNumber(), aTeacher.getFirstName());


//      Display a menu
//      Menu options: Add a student, Add a teacher, Add a course, List students, List teachers, List courses

        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Select an option number to continue:\n" +
                    "1.Add a student\n" +
                    "2.Add a teacher\n" +
                    "3.Add a course\n" +
                    "4.List students\n" +
                    "5.List teachers\n" +
                    "6.List courses\n" +
                    "7.Add a student or teacher to course\n" +
                    "8.Quit");

            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add a student");
                    //  Get user input
                    String studentlastName;
                    String studentIDNumber;
                    String studentEmailAddress;

                    System.out.println("Enter student's first name");
                    String studentFirstName = keyboard.nextLine();

                    System.out.println("Enter student's last name");
                    studentlastName = keyboard.nextLine();

                    System.out.println("Enter student's email ");
                    studentEmailAddress = keyboard.nextLine();

                    System.out.println("Enter student's id Number ");
                    studentIDNumber = keyboard.nextLine();

                    //Create a new student and add to list of students
                    allStudents.add(new Student(studentIDNumber, studentFirstName, studentlastName, studentEmailAddress));

                    break;
                case 2:
                    System.out.println("Add a teacher");
                    //  Get user input
                    String teacherLastName;
                    String teacherIDNumber;
                    String teacherEmailAddress;

                    System.out.println("Enter teacher's first name");
                    String teacherfirstName = keyboard.nextLine();

                    System.out.println("Enter teacher's last name");
                    teacherLastName = keyboard.nextLine();

                    System.out.println("Enter teacher's email ");
                    teacherEmailAddress = keyboard.nextLine();

                    System.out.println("Enter teacher's id Number ");
                    teacherIDNumber = keyboard.nextLine();

                    //Create a new student and add to list of students
                    allTeachers.add(new Teacher(teacherIDNumber, teacherfirstName, teacherLastName, teacherEmailAddress));
                    break;
                case 3:
                    System.out.println("Add a course");
//                    Get user input
                    System.out.println("Enter course name");
                    String courseName = keyboard.nextLine();

                    System.out.println("Enter course id number");
                    String courseId = keyboard.nextLine();

                    Course theNewCourse = new Course(courseId, courseName);
                    allCourses.add(theNewCourse);

                    String addStudentTeacher = "";
                    do {
//                        String addStudentTeacher, Scanner keyboard, ArrayList<Student> allStudents, ArrayList<Teacher> allTeachers, Course theNewCourse
                        addStudentTeacher = addStudentOrTeacherToCourse(addStudentTeacher,keyboard,allStudents,allTeachers,theNewCourse);
                    } while (!addStudentTeacher.equalsIgnoreCase("none"));


                break;
                case 4:
                    System.out.println("List students");
                    for (Student student : allStudents) {
                        System.out.printf("ID Number: %s\nFirst Name: %s\nLast Name: %s\nE-mail Address: %s\n\n",
                                student.getIdNumber(), student.getFirstName(), student.getLastName(), student.getEmail());
                    }
                    break;
                case 5:
                    System.out.println("List teachers");
                    for (Teacher teacher : allTeachers) {
                        System.out.printf("ID Number: %s\nFirst Name: %s\nLast Name: %s\nE-mail Address: %s\n\n",
                                teacher.getIdNumber(), teacher.getFirstName(), teacher.getLastName(), teacher.getEmail());
                    }
                        break;
                case 6:
                    System.out.println("List courses");
                    listCourses(allCourses);;
//                    listCourses(allCourses,allStudents,allTeachers);
                    break;

                case 7:
                    System.out.println("Add student or teacher to existing course");
                    System.out.println("Enter a course ID");
                    courseId = keyboard.nextLine();
                    Course toFind = findCourseById(courseId,allCourses);

//                    public static String addStudentOrTeacherToCourse(String addStudentTeacher, Scanner keyboard, ArrayList<Student> allStudents, ArrayList<Teacher> allTeachers, Course theNewCourse) {
                    addStudentOrTeacherToCourse("",keyboard,allStudents,allTeachers,toFind);
                break;
                case 8:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Don't get cute");
                    break;
            }

        } while (choice!= 8);

//      Create a new teacher

//      Create a new student

//      Create a new course



//        for(Course eachCourse : aTeacher.getCoursesTaught())
//        {
//            System.out.println(eachCourse.getIdNumber());
//            System.out.println(eachCourse.getCourseName());
//        }
//
//
//
//        ArrayList <Course> myCourses = (ArrayList) aStudent.getCoursesTaken();
//        myCourses.add(findCourseById("123456",allCourses));
//        aStudent.setCoursesTaken(myCourses);
    }


    public static Course findCourseById(String idNumber, ArrayList<Course> list) {
        Course foundCourse = null;
        for (Course eachcourse : list) {
            if (idNumber.equalsIgnoreCase(eachcourse.getIdNumber())) {
                foundCourse = eachcourse;
            }
        }
        return foundCourse;
    }

    public static Teacher findTeacher(String idNumber, ArrayList<Teacher> list) {
        Teacher teacherToReturn = null;
        for (Teacher eachTeacher : list) {
            if (idNumber.equalsIgnoreCase(eachTeacher.getIdNumber())) {
                teacherToReturn = eachTeacher;
            }
        }
        return teacherToReturn;
    }

    public static Student findStudent(String idNumber, ArrayList<Student> list) {
        Student studentToReturn = null;
        for (Student eachStudent : list) {
            if (idNumber.equalsIgnoreCase(eachStudent.getIdNumber())) {
                studentToReturn = eachStudent;
            }
        }

        return studentToReturn;

    }

    public static void listCourses(ArrayList<Course> list){

        for(Course course : list){

            System.out.println(course.getClass().getSimpleName());
            ArrayList<Teacher> teacherList = course.getTeachersForThisCourse();
            ArrayList<Student> studentList = course.getStudentsTakingThisCourse();
            String sPrefix = "";
            System.out.println("Course ID: " + course.getIdNumber());
            System.out.println("Course Name: " + course.getCourseName());
            sPrefix = "";
            if(teacherList.size() > 0){

                System.out.print("Taught by: ");
                for(Teacher teacher : teacherList){

                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                    sPrefix = ", ";
                }
            }
            else {

                    System.out.println("nobody is teaching this class");
            }
            sPrefix = "";
            if(studentList.size() > 0) {

                System.out.print("Is taken by: ");
                for (Student student : studentList) {

                    System.out.println(student.getFirstName() + " " + student.getLastName());
                    sPrefix = ", ";

                }
            }
            else {

                    System.out.println("nobody is taking this class");
            }

            System.out.println("\n");
        }//end for(Course course : list)

    }//end public static void ListCourses(ArrayList<Course> list)

//    public static void  listCourses(ArrayList <Course> allCourses, ArrayList<Student> allStudents, ArrayList<Teacher> allTeachers){
//
//            for(Course eachCourse: allCourses)
//            {
//                System.out.printf("Course name: %s\n",eachCourse.getCourseName());
//
//                System.out.println("Taught by");
//                for (Teacher eachTeacher : allTeachers)
//                {
//                    if(eachTeacher.getCoursesTaught().contains(eachCourse))
//                    {
//                        System.out.println(eachTeacher.getFirstName()+" "+ eachTeacher.getLastName());
//                    }
//
//                }
//                System.out.println();
//
//                System.out.println("Taken by:");
//                for (Student eachStudent:allStudents)
//                {
//                    if(eachStudent.getCoursesTaken().contains(eachCourse))
//                    {
//                        System.out.println(eachStudent.getFirstName()+" "+eachStudent.getLastName());
//                    }
//                }
//            }
//    }

//    public static String addStudentOrTeacherToCourse(String addStudentTeacher, Scanner keyboard, ArrayList<Student> allStudents, ArrayList<Teacher> allTeachers, Course theNewCourse) {
    public static String addStudentOrTeacherToCourse(
            String addStudentTeacher, Scanner keyboard, ArrayList<Student> allStudents, ArrayList<Teacher> allTeachers, Course theNewCourse) {


        System.out.println("Would you like to add this course to a student or teacher?\n" +
                "Enter student or teacher to select, 'none' to return to the main menu.");

        addStudentTeacher = keyboard.nextLine();
        if (!addStudentTeacher.equalsIgnoreCase("student")
                && !addStudentTeacher.equalsIgnoreCase("teacher")
                && !addStudentTeacher.equalsIgnoreCase("none")) {
            System.out.println("Enter a valid option!!");
        }

        if (!addStudentTeacher.equalsIgnoreCase("none")) {
            System.out.println("Enter the ID:");
            String teacherStudentID = keyboard.nextLine();
            if (addStudentTeacher.equalsIgnoreCase("student")) {
                Student foundStudent = findStudent(teacherStudentID, allStudents);
                theNewCourse.addStudent(foundStudent);
//                foundStudent.addACourse(theNewCourse);
            } else {
                Teacher foundTeacher = findTeacher(teacherStudentID, allTeachers);
                theNewCourse.addTeacher(foundTeacher);
//                foundTeacher.addACourse(theNewCourse);
            }

        }
        return addStudentTeacher;

    }


}
