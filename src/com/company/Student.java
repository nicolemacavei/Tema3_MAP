package com.company;

import java.util.*;

public class Student extends Person {

    private int studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    /**
     * Instantiates a new Student.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param studentId the student id
     */
    public Student(String firstName, String lastName, int studentId) {

        super(firstName, lastName);
        this.studentId = studentId;
        this.totalCredits = 0;
        this.enrolledCourses = new ArrayList<>();
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return getFirstName() + ", " + getLastName() + ", " + studentId + ", Total ECTS = " + totalCredits ;
    }

    /**
     * add the stduent to the list
     * add the credits for the course in the total
     * @param course = new course
     */
    public void addCourse(Course course) {

        if (enrolledCourses.contains(course)) {

            System.out.print("Course already exists in the list ");
        }
        else{

            if (totalCredits + course.getCredits() <= 30) {

                enrolledCourses.add(course);
                totalCredits += course.getCredits();
            }
            else {

                System.out.print("ECTS Limit !");
            }
        }
    }

    /**
     * delete a certain course
     * delete its credits
     * @param course = the course
     */
    public void removeCourse(Course course){

        if(!enrolledCourses.contains(course)){

            System.out.println("Course does not exist");
        }
        else {

            totalCredits -= course.getCredits();
            enrolledCourses.remove(course);
        }
    }

    /**
     * change the credits for a specific course
     * @param course = noul curs sau "object"
     * @param credits = noua valoare pt credite
     */
    public void updateCredits(Course course, int credits){

        if(!enrolledCourses.contains(course)){

            System.out.println("Course does not exist");
        }
        else{

            for(Course i : enrolledCourses){

                if(Objects.equals(i.getName(), course.getName())){

                    int val = totalCredits - i.getCredits() + credits;

                    if(val <= 30){

                        totalCredits = val;
                        break;
                    }
                    else{

                        enrolledCourses.remove(i);
                        totalCredits -= i.getCredits();
                        System.out.println("The limit for : " + this.studentId + " is done !");
                        System.out.println("The course was deleted.");
                    }
                }
            }
        }
    }



}
